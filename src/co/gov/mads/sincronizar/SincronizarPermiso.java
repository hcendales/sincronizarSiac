package co.gov.mads.sincronizar;

import co.gov.ideam.rua.electrico.webservices.WS_IDEAM_RUA_RegistrarPermiso;
import co.gov.ideam.rua.electrico.webservices.WS_IDEAM_RUA_RegistrarPermiso_Service;
import co.gov.ideam.sirh.webservices.businessl.registrarpermiso.PermisoWS;
import co.gov.ideam.sirh.webservices.businessl.registrarpermiso.PredioWS;
import co.gov.ideam.sirh.webservices.businessl.registrarpermiso.RepresentanteWS;
import co.gov.ideam.sirh.webservices.businessl.registrarpermiso.UsuarioAguaWS;
import co.gov.ideam.sirh.webservices.businessl.registrarpermiso.WS_SIAC_SIRH_RegistrarPermiso;
import co.gov.ideam.sirh.webservices.businessl.registrarpermiso.WS_SIAC_SIRH_RegistrarPermiso_Service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Properties;
import java.util.logging.Logger;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import oracle.jdbc.OracleTypes;

public class SincronizarPermiso {

    private static final Logger LOGGER = Logger.getLogger("SincronizarSiac");

    private Connection conn = null;
    private Properties propiedades = null;

    public SincronizarPermiso(Connection conn, Properties propiedades) {
        super();

        this.conn = conn;
        this.propiedades = propiedades;

    }

    public void Aplicar() throws SQLException, Exception {

        HomologarPermisos(conn);

        ResultSet sirh_permisos =
            ObtenerPermisos("PK_PRC_SINCRONIZAR.Pr_DarPermisosSIRH", conn);
        //ReportarSIRH(sirh_permisos);
        sirh_permisos.close();

        ResultSet snif_permisos =
            ObtenerPermisos("PK_PRC_SINCRONIZAR.Pr_DarPermisosSNIF", conn);
        //ReportarSNIF(snif_permisos);
        snif_permisos.close(); 

        ResultSet rua_permisos =
            ObtenerPermisos("PK_PRC_SINCRONIZAR.Pr_DarPermisosRUA", conn);
        ReportarRUA(rua_permisos);
        rua_permisos.close();

    }

    public void HomologarPermisos(Connection conn) throws SQLException,
                                                          Exception {

        CallableStatement cstmt = null;

        cstmt =
                conn.prepareCall("{call " + "PK_PRC_SINCRONIZAR.Pr_HomologarPermisos" +
                                 "(?,?)}");
        cstmt.registerOutParameter("p_codError", OracleTypes.INTEGER);
        cstmt.registerOutParameter("p_msjError", OracleTypes.VARCHAR);

        cstmt.execute();

        if (cstmt.getInt("p_codError") != 0)
            throw new Exception("Se genero error " +
                                cstmt.getString("p_msjError"));

        LOGGER.info("Ejecuto " + "PK_PRC_SINCRONIZAR.Pr_HomologarPermisos" +
                    " OK. " + cstmt.getString("p_msjError"));

    }

    public ResultSet ObtenerPermisos(String nombreSp,
                                     Connection conn) throws SQLException,
                                                             Exception {
        CallableStatement cstmt = null;
        ResultSet rs = null;

        cstmt = conn.prepareCall("{call " + nombreSp + "(?,?,?)}");

        cstmt.registerOutParameter("p_codError", OracleTypes.INTEGER);
        cstmt.registerOutParameter("p_msjError", OracleTypes.VARCHAR);
        cstmt.registerOutParameter("p_datRespuesta", OracleTypes.CURSOR);

        cstmt.execute();

        if (cstmt.getInt("p_codError") != 0)
            throw new Exception("Se genero error " +
                                cstmt.getString("p_msjError"));

        LOGGER.info("Ejecuto " + nombreSp + " OK. " +
                    cstmt.getString("p_msjError"));

        // get cursor and cast it to ResultSet
        rs = (ResultSet)cstmt.getObject("p_datRespuesta");

        return rs;


    }

    @WebServiceRef
    private static WS_SIAC_SIRH_RegistrarPermiso_Service wS_SIAC_SIRH_RegistrarPermiso_Service;

    public void ReportarSIRH(ResultSet sirh_permisos) throws SQLException {

        while (sirh_permisos.next()) {
            try {


                LOGGER.info("Se reporta a SIRH a017codigo:" +
                            sirh_permisos.getLong("A017CODIGO"));

                wS_SIAC_SIRH_RegistrarPermiso_Service =
                        new WS_SIAC_SIRH_RegistrarPermiso_Service();
                WS_SIAC_SIRH_RegistrarPermiso wS_SIAC_SIRH_RegistrarPermiso =
                    wS_SIAC_SIRH_RegistrarPermiso_Service.getRegistrarPermisoSirhPort();

                BindingProvider bp =
                    (BindingProvider)wS_SIAC_SIRH_RegistrarPermiso; // http://129.144.6.77:8001
                bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                                           "http://129.144.6.77:8001/WS_SIRH_RegistrarPermiso/proxy/RegistrarPermisoProxy");

                co.gov.ideam.sirh.webservices.businessl.registrarpermiso.OeRegistrarPermiso oe =
                    new co.gov.ideam.sirh.webservices.businessl.registrarpermiso.OeRegistrarPermiso();

                String origen = "VITAL";
                PermisoWS permiso = new PermisoWS();

                permiso.setCantidadRecursoOtorgado(new Double(sirh_permisos.getString("A017CANTIDADRECURSO").replaceAll(",",
                                                                                                                        ".")));
                permiso.setFechaExpedicion(sirh_permisos.getString("A017FECHAEXPEDICION"));
                permiso.setFechaVencimiento(sirh_permisos.getString("A017FECHAVENCIMIENTO"));
                permiso.setNumExpediente(sirh_permisos.getString("A017NUMEROEXPEDIENTE"));
                permiso.setNumResolucion(sirh_permisos.getString("A017NUMERORESOLUCION"));
                permiso.setTipoPermiso(sirh_permisos.getString("A017TIPOPERMISO"));


                PredioWS predio = new PredioWS();
                predio.setCedulaCatastral(sirh_permisos.getString("A017CEDULACATASTRAL"));
                predio.setDireccionPredio(sirh_permisos.getString("A017DIRECCIONAPR"));
                predio.setIdDeptoPredio(new Integer(sirh_permisos.getString("A017DEPARTAMENTOAPR")));
                predio.setIdMunicipioPredio(new Integer(sirh_permisos.getString("A017MUNICIPIOAPR")));
                predio.setMatriculaInmobiliaria(sirh_permisos.getString("A017MATRICULAINMOBILIARIA"));
                predio.setNombrePredio(sirh_permisos.getString("A017CEDULACATASTRAL"));


                RepresentanteWS representanteLegal = new RepresentanteWS();

                representanteLegal.setCodigoTipoIdentificacionRepLegal(sirh_permisos.getString("A017TIPODOCUMENTORL"));
                representanteLegal.setDireccionCorrespondencia(sirh_permisos.getString("A017DIRECCIONNOTIF"));
                representanteLegal.setIdDeptoCorrespondencia(new Integer(sirh_permisos.getString("A017DEPARTAMENTONOTIF")));
                representanteLegal.setIdMunicipioCorrespondencia(new Integer(sirh_permisos.getString("A017MUNICIPIONOTIF")));
                representanteLegal.setIdentificacionRepLegal(sirh_permisos.getString("A017DOCUMENTORL"));
                representanteLegal.setPrimerApellidoRepLegal(sirh_permisos.getString("A017PRIMERAPELLIDORL"));
                representanteLegal.setPrimerNombreRepLegal(sirh_permisos.getString("A017PRIMERNOMBRERL"));
                representanteLegal.setSegundoApellidoRepLegal(sirh_permisos.getString("A017SEGUNDOAPELLIDORL"));
                representanteLegal.setSegundoNombreRepLegal(sirh_permisos.getString("A017SEGUNDONOMBRERL"));

                UsuarioAguaWS usuarioAgua = new UsuarioAguaWS();
                usuarioAgua.setActividadCIIU(sirh_permisos.getInt("A017ACTIVIDADECONOMICA"));
                usuarioAgua.setCelular(sirh_permisos.getString("A017CELULARCONTACTO"));

                usuarioAgua.setCodAutoridadAmbiental(new Integer("22"));
                //usuarioAgua.setCodAutoridadAmbiental(new Integer(sirh_permisos.getString("A017AUTORIDADOTORGA")));

                usuarioAgua.setCodigoTipoIdentificacion(new Integer(sirh_permisos.getString("A017TIPOIDENTIFICACION")));
                usuarioAgua.setDireccionCorreoElectronico(sirh_permisos.getString("A017CORREOELECTRONICO"));
                usuarioAgua.setIdDeptoCorrespondencia(new Integer(sirh_permisos.getString("A017DEPARTAMENTONOTIF")));
                usuarioAgua.setIdMunicipioCorrespondencia(new Integer(sirh_permisos.getString("A017MUNICIPIONOTIF")));
                usuarioAgua.setIdentificacionPersona(sirh_permisos.getString("A017IDENTIFICACION"));
                usuarioAgua.setPrimerApellido(sirh_permisos.getString("A017PRIMERAPELLIDO"));
                usuarioAgua.setPrimerNombre(sirh_permisos.getString("A017PRIMERNOMBRE"));
                usuarioAgua.setRazonSocial(sirh_permisos.getString("A017RAZONSOCIAL"));
                usuarioAgua.setSegundoApellido(sirh_permisos.getString("A017SEGUNDOAPELLIDO"));
                usuarioAgua.setSegundoNombre(sirh_permisos.getString("A017SEGUNDONOMBRE"));
                usuarioAgua.setTelefonoFijo(sirh_permisos.getString("A017TELEFONO"));
                usuarioAgua.setTipoPersona(new Integer(sirh_permisos.getString("A017TIPOPERSONA")));

                oe.setOrigen(origen);
                oe.setPermiso(permiso);
                oe.setPredio(predio);
                oe.setRepresentanteLegal(representanteLegal);
                oe.setUsuarioAgua(usuarioAgua);

                co.gov.ideam.sirh.webservices.businessl.registrarpermiso.OsRegistrarPermiso os =
                    wS_SIAC_SIRH_RegistrarPermiso.registrarPermiso(oe);

                LOGGER.info("Se genero respuesta :" + os.getCodigoError() +
                            " " + os.getMensajeError());

            } catch (Exception e) {
                LOGGER.info("Problemas en consumo SIRH " + e.getMessage());
            }
        }

    }

    @WebServiceRef
    private static WS_IDEAM_RUA_RegistrarPermiso_Service wS_IDEAM_RUA_RegistrarPermiso_Service;

    public void ReportarRUA(ResultSet rua_permisos) throws SQLException {

        while (rua_permisos.next()) {
            try {


                LOGGER.info("Se reporta a RUA a023codigo:" +
                            rua_permisos.getLong("A023CODIGO"));

                wS_IDEAM_RUA_RegistrarPermiso_Service =
                        new WS_IDEAM_RUA_RegistrarPermiso_Service();
                WS_IDEAM_RUA_RegistrarPermiso wS_IDEAM_RUA_RegistrarPermiso =
                    wS_IDEAM_RUA_RegistrarPermiso_Service.getWS_IDEAM_RUA_RegistrarPermisoPort();

                BindingProvider bp =
                    (BindingProvider)wS_IDEAM_RUA_RegistrarPermiso; // http://129.144.6.77:8001
                bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                                           "http://129.150.71.162:9073/WS_RUA_RegistrarPermiso/proxy/RegistrarPermisoProxy");

                co.gov.ideam.rua.electrico.webservices.OeRegistrarPermiso oe =
                    new co.gov.ideam.rua.electrico.webservices.OeRegistrarPermiso();

                oe.setActividadCIIU(rua_permisos.getString("A023ACTIVIDADECONOMICA"));
                oe.setCedulaCatastral(rua_permisos.getString("A023CEDULACATASTRAL"));
                oe.setCelular(rua_permisos.getString("A023CELULARCONTACTO"));
                oe.setCodAutoridadAmbiental(rua_permisos.getString("A023AUTORIDADOTORGA"));
                oe.setCodigoTipoIdentificacion(new Long(rua_permisos.getString("A023TIPOIDENTIFICACION")));
                oe.setCodigoTipoIdentificacionRepLegal(new Long(rua_permisos.getString("A023TIPODOCUMENTORL")));
                oe.setDireccionCorreoElectronico(rua_permisos.getString("A023CORREOELECTRONICO"));
                oe.setDireccionCorrespondencia(rua_permisos.getString("A023DIRECCIONNOTIF"));
                oe.setDireccionPredio(rua_permisos.getString("A023DIRECCIONAPR"));
                oe.setFechaExpedicion(rua_permisos.getString("A023FECHAEXPEDICION"));
                
                LOGGER.info("fECHA EXPEDICION " + rua_permisos.getString("A023FECHAEXPEDICION"));
                LOGGER.info("fECHA venci " + rua_permisos.getString("A023FECHAVENCIMIENTO"));
                
                oe.setFechaVencimiento(rua_permisos.getString("A023FECHAVENCIMIENTO"));
                oe.setIdDeptoCorrespondencia(rua_permisos.getString("A023DEPARTAMENTONOTIF"));
                oe.setIdDeptoPredio(rua_permisos.getString("A023DEPARTAMENTOAPR"));
                oe.setIdMunicipioCorrespondencia(rua_permisos.getString("A023MUNICIPIONOTIF"));
                oe.setIdMunicipioPredio(rua_permisos.getString("A023MUNICIPIOAPR"));
                oe.setIdentificacionPersona(rua_permisos.getString("A023IDENTIFICACION"));
                oe.setIdentificacionRepLegal(rua_permisos.getString("A023DOCUMENTORL"));
                oe.setMatriculaInmobiliaria(rua_permisos.getString("A023MATRICULAINMOBILIARIA"));
                oe.setNombrePredio(rua_permisos.getString("A023DIRECCIONAPR"));
                oe.setNumExpediente(rua_permisos.getString("A023NUMEROEXPEDIENTE"));
                oe.setNumResolucion(rua_permisos.getString("A023NUMERORESOLUCION"));
                oe.setPrimerApellido(rua_permisos.getString("A023PRIMERAPELLIDO"));
                oe.setPrimerApellidoRepLegal(rua_permisos.getString("A023PRIMERAPELLIDORL"));
                oe.setPrimerNombre(rua_permisos.getString("A023PRIMERNOMBRE"));
                oe.setPrimerNombreRepLegal(rua_permisos.getString("A023PRIMERNOMBRERL"));
                oe.setRazonSocial(rua_permisos.getString("A023RAZONSOCIAL"));
                oe.setSegundoApellido(rua_permisos.getString("A023SEGUNDOAPELLIDO"));
                oe.setSegundoApellidoRepLegal(rua_permisos.getString("A023SEGUNDOAPELLIDORL"));
                oe.setSegundoNombre(rua_permisos.getString("A023SEGUNDONOMBRE"));
                oe.setSegundoNombreRepLegal(rua_permisos.getString("A023SEGUNDONOMBRERL"));
                oe.setTelefonoFijo(rua_permisos.getString("A023TELEFONO"));
                oe.setTipoPermiso(new Long(rua_permisos.getString("A023TIPOPERMISO")));
                oe.setTipoPersona(new Long(rua_permisos.getString("A023TIPOPERSONA")));
                oe.setUnidad(rua_permisos.getString("A023UNIDADRECURSO"));
                
                String valorArea = rua_permisos.getString("A023CANTIDADRECURSO");
                valorArea = valorArea.replaceAll(",", ".");
                Double vlr = new Double(valorArea);
                oe.setVolumenArea(vlr.intValue()); 

                LOGGER.info("Valor area:" + vlr);
                
                co.gov.ideam.rua.electrico.webservices.OsRegistrarPermiso os =
                    wS_IDEAM_RUA_RegistrarPermiso.registrarPermiso(oe);

                LOGGER.info("Se genero respuesta :" + os.getCodigoError() +
                            " " + os.getMensajeError());

            } catch (Exception e) {
                LOGGER.info("Problemas en consumo RUA " + e.getMessage());
            }
        }

    }

}
