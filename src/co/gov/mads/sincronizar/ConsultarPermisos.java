package co.gov.mads.sincronizar;

import co.gov.ideam.sirh.webservices.businessl.consultarpermisos.ConsultarPermisosV;
import co.gov.ideam.sirh.webservices.businessl.consultarpermisos.WS_SIAC_SIRH_ConsultarPermisos;
import co.gov.ideam.sirh.webservices.businessl.consultarpermisos.WS_SIAC_SIRH_ConsultarPermisos_Service;

import co.gov.ideam.snif.integracion.webservices.consultarpermisos.ConsultaPermisos;
import co.gov.ideam.snif.integracion.webservices.consultarpermisos.WSConsultarPermisos;
import co.gov.ideam.snif.integracion.webservices.consultarpermisos.WS_IDEAM_SNIF_ConsultarPermisos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import oracle.jdbc.OracleTypes;

public class ConsultarPermisos {

    @WebServiceRef
    private static WS_SIAC_SIRH_ConsultarPermisos_Service wS_SIAC_SIRH_ConsultarPermisos_Service;

    @WebServiceRef
    private static WS_IDEAM_SNIF_ConsultarPermisos wS_IDEAM_SNIF_ConsultarPermisos;

    private static final Logger LOGGER = Logger.getLogger("SincronizarSiac");

    private Connection conn = null;
    private Properties propiedades = null;

    public ConsultarPermisos(Connection conn, Properties propiedades) {
        super();

        this.conn = conn;
        this.propiedades = propiedades;

    }

    public void Aplicar() throws SQLException, Exception {
        
        ResultSet autoridad =
            ObtenerAutoridades("PK_ADM_PARAMETRO.Pr_ConsultarAutoridades");
        while (autoridad.next()) {
            LOGGER.info("Se consulta permisos de autoridad :" +
                        autoridad.getString("a001sigla"));

            ConsultarPermisosSirh(autoridad.getString("a001sigla"));
            ConsultarPermisosSnif(autoridad.getString("a001sigla"));

        }

        autoridad.close();


    }
    public void ConsultarPermisosSirh(String siglaAutoridad) {
        try {
            wS_SIAC_SIRH_ConsultarPermisos_Service = new WS_SIAC_SIRH_ConsultarPermisos_Service();
            WS_SIAC_SIRH_ConsultarPermisos wS_SIAC_SIRH_ConsultarPermisos = wS_SIAC_SIRH_ConsultarPermisos_Service.getConsultarPermisoSirhPort();

            BindingProvider bp =
                (BindingProvider)wS_SIAC_SIRH_ConsultarPermisos; // http://129.144.6.77:8001
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                                //"http://129.144.6.77:8001/WS_SIRH_ConsultarPermisos/proxy/ConsultarPermisosProxy");
                                "http://181.225.72.35:8230/Ideam-Ejb/WS_SIAC_SIRH_ConsultarPermisos/WS_SIAC_SIRH_ConsultarPermisos" );
            
            

            co.gov.ideam.sirh.webservices.businessl.consultarpermisos.OeConsultarPermisos oe = new co.gov.ideam.sirh.webservices.businessl.consultarpermisos.OeConsultarPermisos();
            
            oe.setCodAutoridadAmbiental(siglaAutoridad);
            oe.setFiltroConsulta("T");
            
            Calendar c1 = GregorianCalendar.getInstance();
                   
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
            String ff = df.format(c1.getTime());
            
            c1.add(Calendar.MONTH, -1);
            
            String fi = df.format(c1.getTime());
            
            oe.setFechaInicio(fi);
            oe.setFechaFin(ff);
            
            co.gov.ideam.sirh.webservices.businessl.consultarpermisos.OsConsultarPermisos os = wS_SIAC_SIRH_ConsultarPermisos.consultarPermisos(oe);

            if (os.getCodigoError() != 0) {
                LOGGER.info("Fallo al consultar permisos SIRH de autoridad " +
                            siglaAutoridad + ". Error: " +
                            os.getCodigoError() + " - " +
                            os.getMensajeError());
                return;
            }
            
            List<co.gov.ideam.sirh.webservices.businessl.consultarpermisos.ConsultarPermisosV> listaPermiso = os.getListaPermisos();
            

            for (co.gov.ideam.sirh.webservices.businessl.consultarpermisos.ConsultarPermisosV p : listaPermiso) {
                LOGGER.info("Permiso " + siglaAutoridad + ":" + p.getPrimernombre() + " " + p.getPrimerapellido());
                ActualizarPermisoSirh(p,siglaAutoridad, "SIRH" );
            }
        
        } catch (Exception e) {
            LOGGER.info("Problemas en WS para autoridad " + siglaAutoridad +
                        " Error:" + e.getMessage());

        }

    }
    
    public void ConsultarPermisosSnif(String siglaAutoridad) {
        try {
            wS_IDEAM_SNIF_ConsultarPermisos = new WS_IDEAM_SNIF_ConsultarPermisos();
            WSConsultarPermisos wSConsultarPermisos = wS_IDEAM_SNIF_ConsultarPermisos.getWSConsultarPermisosPort();

            BindingProvider bp =
                (BindingProvider)wSConsultarPermisos; // http://129.144.6.77:8001
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                                //"http://129.144.6.77:8001/WS_SIRH_ConsultarPermisos/proxy/ConsultarPermisosProxy");
                                "http://181.225.72.78:8080/snif-integra-ws-web/WS_IDEAM_SNIF_ConsultarPermisos" );
            
            

            co.gov.ideam.snif.integracion.webservices.consultarpermisos.OeConsultarPermisos oe = new co.gov.ideam.snif.integracion.webservices.consultarpermisos.OeConsultarPermisos();
            
            oe.setCodAutoridadAmbiental(siglaAutoridad);
            oe.setFiltroConsulta("T");
            
            Calendar c1 = GregorianCalendar.getInstance();
                   
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
            String ff = df.format(c1.getTime());
            
            c1.add(Calendar.MONTH, -1);
            
            String fi = df.format(c1.getTime());
            
            oe.setFechaInicio(fi);
            oe.setFechaFin(ff);
            
            co.gov.ideam.snif.integracion.webservices.consultarpermisos.OsConsultarPermisos os = wSConsultarPermisos.consultarPermisos(oe);

            if (os.getCodigoError() != 0) {
                LOGGER.info("Fallo al consultar permisos SIRH de autoridad " +
                            siglaAutoridad + ". Error: " +
                            os.getCodigoError() + " - " +
                            os.getMensajeError());
                return;
            }
            
            List<co.gov.ideam.snif.integracion.webservices.consultarpermisos.ConsultaPermisos> listaPermiso = os.getListaConsultaPermisos();
            

            for (co.gov.ideam.snif.integracion.webservices.consultarpermisos.ConsultaPermisos p : listaPermiso) {
                LOGGER.info("Permiso " + siglaAutoridad + ":" + p.getNombreUsuario());
                ActualizarPermisoSnif(p,siglaAutoridad, "SNIF" );
            }
        
        } catch (Exception e) {
            LOGGER.info("Problemas en WS para autoridad " + siglaAutoridad +
                        " Error:" + e.getMessage());

        }

    }
    
    public void ActualizarPermisoSirh (co.gov.ideam.sirh.webservices.businessl.consultarpermisos.ConsultarPermisosV p, String siglaAutoridad, String sistema ) throws SQLException,
                                                         Exception {
        CallableStatement cstmt = null;
        ResultSet rs = null;

        cstmt = conn.prepareCall("{call PK_ADM_PERMISO.Pr_RegistrarPermisoSiac" +  "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        
        cstmt.setString("p_sistemaOrigen", sistema);
        cstmt.setString("p_tipoidentificacion", p.getCodigotipoidentificacion().toString());
        cstmt.setString("p_identificacion", p.getIdentificacionpersona());
        cstmt.setString("p_digitochequeo", "");
        cstmt.setString("p_tipopersona", p.getTipopersona().toString());
        cstmt.setString("p_actividadeconomica", "");
        cstmt.setString("p_correoelectronico", "");
        cstmt.setString("p_indtelefono", "");
        cstmt.setString("p_telefono", "");
        cstmt.setString("p_celularcontacto", "");

        cstmt.setString("p_primernombre", p.getPrimernombre());
        cstmt.setString("p_segundonombre", "");
        cstmt.setString("p_primerapellido", p.getPrimerapellido());
        cstmt.setString("p_segundoapellido", "");
        cstmt.setString("p_razonsocial", p.getRazonsocial());
        cstmt.setString("p_nombrecomercial", "");
        cstmt.setString("p_tipodocumentorl", "");
        cstmt.setString("p_documentorl", "");
        cstmt.setString("p_primernombrerl", "");
        cstmt.setString("p_segundonombrerl", "");
        
        cstmt.setString("p_primerapellidorl", "");
        cstmt.setString("p_segundoapellidorl", "");
        cstmt.setString("p_departamentonotif", "");
        cstmt.setString("p_municipionotif", "");
        cstmt.setString("p_direccionnotif", "");
        cstmt.setString("p_departamentoapr", p.getIddeptopredio().toString());
        cstmt.setString("p_municipioapr", p.getIdmunicipiopredio().toString());
        cstmt.setString("p_direccionapr", p.getDireccionpredio());
        cstmt.setString("p_categoriaapr", "");
        cstmt.setString("p_matriculainmobiliaria", p.getMatriculainmobiliaria());
        
        cstmt.setString("p_cedulacatastral", p.getCedulacatastral());
        cstmt.setString("p_autoridadotorga", siglaAutoridad);
        cstmt.setString("p_numeroexpediente", p.getNumexpediente());
        cstmt.setString("p_numeroresolucion", p.getNumresolucion());
        cstmt.setString("p_fechaexpedicion", p.getFechaexpedicion().toString());
        cstmt.setString("p_fechavencimiento", p.getFechavencimiento().toString());
        cstmt.setString("p_tipopermiso", p.getTipopermiso());
        cstmt.setString("p_unidadrecurso", "" );
        cstmt.setString("p_cantidadrecurso", p.getCantidadrecursootorgado().toString());
        cstmt.setString("p_estado", p.getEstadoinfotecnica());
                
        cstmt.registerOutParameter("p_codError", OracleTypes.INTEGER);
        cstmt.registerOutParameter("p_msjError", OracleTypes.VARCHAR);
        cstmt.registerOutParameter("p_numAutorizacion", OracleTypes.INTEGER);

        cstmt.execute();

        if (cstmt.getInt("p_codError") != 0)
            throw new Exception("Se genero error " + cstmt.getInt("p_codError") + "-" + cstmt.getString("p_msjError"));

        LOGGER.info("Ejecuto " + "Pr_ActualizarUsuario" + " OK. " + cstmt.getString("p_msjError"));
        
        cstmt.close();

        
    }
    public void ActualizarPermisoSnif (co.gov.ideam.snif.integracion.webservices.consultarpermisos.ConsultaPermisos p, String siglaAutoridad, String sistema ) throws SQLException,
                                                         Exception {
        CallableStatement cstmt = null;
        ResultSet rs = null;

        cstmt = conn.prepareCall("{call PK_ADM_PERMISO.Pr_RegistrarPermisoSiac" +  "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        
        cstmt.setString("p_sistemaOrigen", sistema);
        cstmt.setString("p_tipoidentificacion", p.getCodigoTipoIdentificacion().toString());
        cstmt.setString("p_identificacion", p.getIdentificacionPersona());
        cstmt.setString("p_digitochequeo", "");
        cstmt.setString("p_tipopersona", p.getTipoPersona());
        cstmt.setString("p_actividadeconomica", "");
        cstmt.setString("p_correoelectronico", "");
        cstmt.setString("p_indtelefono", "");
        cstmt.setString("p_telefono", "");
        cstmt.setString("p_celularcontacto", "");

        cstmt.setString("p_primernombre", p.getNombreUsuario());
        cstmt.setString("p_segundonombre", "");
        cstmt.setString("p_primerapellido", "");
        cstmt.setString("p_segundoapellido", "");
        cstmt.setString("p_razonsocial", "");
        cstmt.setString("p_nombrecomercial", "");
        cstmt.setString("p_tipodocumentorl", "");
        cstmt.setString("p_documentorl", "");
        cstmt.setString("p_primernombrerl", "");
        cstmt.setString("p_segundonombrerl", "");
        
        cstmt.setString("p_primerapellidorl", "");
        cstmt.setString("p_segundoapellidorl", "");
        cstmt.setString("p_departamentonotif", "");
        cstmt.setString("p_municipionotif", "");
        cstmt.setString("p_direccionnotif", "");
        cstmt.setString("p_departamentoapr", p.getCodDeptoPredio());
        cstmt.setString("p_municipioapr", p.getCodMunicipioPredio());
        cstmt.setString("p_direccionapr", p.getDireccionPredio());
        cstmt.setString("p_categoriaapr", "");
        cstmt.setString("p_matriculainmobiliaria", p.getMatriculaInmobiliaria());
        
        cstmt.setString("p_cedulacatastral", p.getCedulaCatastral());
        cstmt.setString("p_autoridadotorga", siglaAutoridad);
        cstmt.setString("p_numeroexpediente", p.getNumExpediente());
        cstmt.setString("p_numeroresolucion", p.getNumResolucion());
        cstmt.setString("p_fechaexpedicion", p.getFechaExpedicion());
        cstmt.setString("p_fechavencimiento", p.getFechaVencimiento());
        cstmt.setString("p_tipopermiso", p.getTipoPermiso());
        cstmt.setString("p_unidadrecurso", "" );
        cstmt.setString("p_cantidadrecurso", "");
        cstmt.setString("p_estado", p.getEstado());
                
        cstmt.registerOutParameter("p_codError", OracleTypes.INTEGER);
        cstmt.registerOutParameter("p_msjError", OracleTypes.VARCHAR);
        cstmt.registerOutParameter("p_numAutorizacion", OracleTypes.INTEGER);

        cstmt.execute();

        if (cstmt.getInt("p_codError") != 0)
            throw new Exception("Se genero error " + cstmt.getInt("p_codError") + "-" + cstmt.getString("p_msjError"));

        LOGGER.info("Ejecuto " + "Pr_ActualizarUsuario" + " OK. " + cstmt.getString("p_msjError"));
        
        cstmt.close();

        
    }

    public ResultSet ObtenerAutoridades(String nombreSp) throws SQLException,
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


}
