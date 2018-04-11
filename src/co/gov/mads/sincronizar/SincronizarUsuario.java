package co.gov.mads.sincronizar;

import co.gov.ideam.integracion.snif.webservices.funcionarios.WSConsultarFuncionario;
import co.gov.ideam.integracion.snif.webservices.funcionarios.WS_IDEAM_SNIF_ConsultarFuncionarios;
import co.gov.ideam.rua.electrico.webservices.VwRuaFuncionarios;
import co.gov.ideam.rua.electrico.webservices.WS_IDEAM_RUA_ConsultarFuncionarios;
import co.gov.ideam.rua.electrico.webservices.WS_IDEAM_RUA_ConsultarFuncionarios_Service;
import co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.Funcionario;
import co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.OeConsultarFuncionarios;
import co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.WS_SIAC_SIRH_ConsultarFuncionarios;
import co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.WS_SIAC_SIRH_ConsultarFuncionarios_Service;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import oracle.jdbc.OracleTypes;

public class SincronizarUsuario {

    private static final Logger LOGGER = Logger.getLogger("SincronizarSiac");

    private Connection conn = null;
    private Properties propiedades = null;

    @WebServiceRef
    private static WS_SIAC_SIRH_ConsultarFuncionarios_Service wS_SIAC_SIRH_ConsultarFuncionarios_Service;

    @WebServiceRef
    private static WS_IDEAM_SNIF_ConsultarFuncionarios wS_IDEAM_SNIF_ConsultarFuncionarios;

    @WebServiceRef
    private static WS_IDEAM_RUA_ConsultarFuncionarios_Service wS_IDEAM_RUA_ConsultarFuncionarios_Service;

    public SincronizarUsuario(Connection conn, Properties propiedades) {
        super();

        this.conn = conn;
        this.propiedades = propiedades;

    }

    public void Aplicar() throws SQLException, Exception {

        ResultSet autoridad =
            ObtenerAutoridades("PK_ADM_PARAMETRO.Pr_ConsultarAutoridades");
        while (autoridad.next()) {
            LOGGER.info("Se actualiza usuario de autoridad :" +
                        autoridad.getString("a001sigla"));

            AplicarUsuariosSirh(autoridad.getString("a001sigla"));
            AplicarUsuariosSnif(autoridad.getString("a001sigla"));
            AplicarUsuariosRua(autoridad.getString("a001sigla"));

        }
        
        autoridad.close();

    }

    public void AplicarUsuariosSirh(String siglaAutoridad) {
        try {
            wS_SIAC_SIRH_ConsultarFuncionarios_Service =
                    new WS_SIAC_SIRH_ConsultarFuncionarios_Service();
            WS_SIAC_SIRH_ConsultarFuncionarios wS_SIAC_SIRH_ConsultarFuncionarios =
                wS_SIAC_SIRH_ConsultarFuncionarios_Service.getConsultarFuncionariosSirhPort();

            BindingProvider bp =
                (BindingProvider)wS_SIAC_SIRH_ConsultarFuncionarios; // http://129.144.6.77:8001
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                                "http://129.144.6.77:8001/WS_SIRH_ConsultarFuncionarios/proxy/ConsultarFuncionariosProxy");
                                //"http://181.225.72.35:8230/Ideam-Ejb/WS_SIAC_SIRH_ConsultarFuncionarios/WS_SIAC_SIRH_ConsultarFuncionarios" );
            co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.OeConsultarFuncionarios oe =
                new co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.OeConsultarFuncionarios();
            oe.setCodAutoridadAmbiental(siglaAutoridad);

            co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.OsConsultarFuncionarios os =
                wS_SIAC_SIRH_ConsultarFuncionarios.consultarFuncionarios(oe);

            if (os.getCodigoError() != 0) {
                LOGGER.info("Fallo al consultar usuarios de autoridad SIRH " +
                            siglaAutoridad + ". Error: " +
                            os.getCodigoError() + " - " +
                            os.getMensajeError());
                return;
            }

            List<co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.Funcionario> lFuncionario = os.getFuncionarios();

            for (co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.Funcionario f : lFuncionario) {
                LOGGER.info("Funcioanrio:" + f.getNombreFuncionario());
                
                ActualizarUsuarioSIRH(f,siglaAutoridad, "SIRH");
            }

        } catch (Exception e) {
            LOGGER.info("Problemas en WS para autoridad " + siglaAutoridad +
                        " Error:" + e.getMessage());

        }

    }
    
    public void AplicarUsuariosSnif(String siglaAutoridad) {
        try {
            
            wS_IDEAM_SNIF_ConsultarFuncionarios = new WS_IDEAM_SNIF_ConsultarFuncionarios();
            WSConsultarFuncionario wSConsultarFuncionario = wS_IDEAM_SNIF_ConsultarFuncionarios.getWSConsultarFuncionarioPort();
            

            BindingProvider bp =
                (BindingProvider)wSConsultarFuncionario; // http://129.144.6.77:8001
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                                //"http://129.144.6.77:8001/WS_SNIF_ConsultarFuncionarios/proxy/ConsultarFuncionariosProxy");
                                "http://181.225.72.78:8080/SNIF-SIAC-WS-web/WS_IDEAM_SNIF_ConsultarFuncionarios" );
            co.gov.ideam.integracion.snif.webservices.funcionarios.OeConsultarFuncionarios oe = new co.gov.ideam.integracion.snif.webservices.funcionarios.OeConsultarFuncionarios();

            oe.setCodAutoridadAmbiental(siglaAutoridad);

            co.gov.ideam.integracion.snif.webservices.funcionarios.OsConsultarFuncionarios  os =
                 wSConsultarFuncionario.consultarFuncionariosAutoridad(oe);

            if (os.getCodigoError() != 0) {
                LOGGER.info("Fallo al consultar usuarios de autoridad SNIF " +
                            siglaAutoridad + ". Error: " +
                            os.getCodigoError() + " - " +
                            os.getMensajeError());
                return;
            }

            List<co.gov.ideam.integracion.snif.webservices.funcionarios.Funcionario> lFuncionario = os.getFuncionarios();

            for (co.gov.ideam.integracion.snif.webservices.funcionarios.Funcionario f : lFuncionario) {
                LOGGER.info("Funcioanrio:" + f.getNombreFuncionario());
                
                ActualizarUsuarioSNIF(f,siglaAutoridad, "SNIF");
            }

        } catch (Exception e) {
            LOGGER.info("Problemas en WS para autoridad " + siglaAutoridad +
                        " Error:" + e.getMessage());

        }

    }

    public void AplicarUsuariosRua(String siglaAutoridad) {
        try {
            
            wS_IDEAM_RUA_ConsultarFuncionarios_Service = new WS_IDEAM_RUA_ConsultarFuncionarios_Service();
            WS_IDEAM_RUA_ConsultarFuncionarios wS_IDEAM_RUA_ConsultarFuncionarios = wS_IDEAM_RUA_ConsultarFuncionarios_Service.getWS_IDEAM_RUA_ConsultarFuncionariosPort();
            

            BindingProvider bp =
                (BindingProvider)wS_IDEAM_RUA_ConsultarFuncionarios; // http://129.144.6.77:8001
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                                "http://129.144.6.77:8001/WS_RUA_ConsultarFuncionarios/proxy/ConsultarFuncionariosProxy");
                                //"http://181.225.72.108:9130/RUA/faces/WS_IDEAM_RUA_ConsultarFuncionarios" );
            co.gov.ideam.rua.electrico.webservices.OeFuncionarios oe = new co.gov.ideam.rua.electrico.webservices.OeFuncionarios();
            oe.setCodAutoridadAmbiental(siglaAutoridad);
            co.gov.ideam.rua.electrico.webservices.OsFuncionarios os = wS_IDEAM_RUA_ConsultarFuncionarios.funcionarios(oe);

            if (os.getCodigoError() != 0) {
                LOGGER.info("Fallo al consultar usuarios de autoridad RUA " +
                            siglaAutoridad + ". Error: " +
                            os.getCodigoError() + " - " +
                            os.getMensajeError());
                return;
            }

            List<co.gov.ideam.rua.electrico.webservices.VwRuaFuncionarios> lFuncionario = os.getListFuncionarios();

            for (co.gov.ideam.rua.electrico.webservices.VwRuaFuncionarios f : lFuncionario) {
                LOGGER.info("Funcioanrio:" + f.getNombrefuncionario());
                
                ActualizarUsuarioRUA(f,siglaAutoridad, "RUA");
            }

        } catch (Exception e) {
            LOGGER.info("Problemas en WS para autoridad " + siglaAutoridad +
                        " Error:" + e.getMessage());

        }

    }
    
    public void ActualizarUsuarioSIRH (co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.Funcionario funcionario, String siglaAutoridad, String sistema ) throws SQLException,
                                                         Exception {
        CallableStatement cstmt = null;
        ResultSet rs = null;

        cstmt = conn.prepareCall("{call PK_ADM_USUARIO.Pr_ActualizarUsuario" +  "(?,?,?,?,?,?,?,?,?,?)}");
        
        cstmt.setString("p_sistema", sistema);
        cstmt.setString("p_siglaAutoridad", siglaAutoridad);
        cstmt.setString("p_aliasUsuario", funcionario.getAliasUsuario());
        cstmt.setString("P_tipoIdentificacion", "" + funcionario.getCodigoTipoIdentificacion());
        cstmt.setString("p_direccionCorreoElectronico", funcionario.getDireccionCorreoElectronico());
        cstmt.setString("p_identificacionPersona", funcionario.getIdentificacionPersona());
        cstmt.setString("p_nombreFuncionario", funcionario.getNombreFuncionario());
        cstmt.setLong("p_esFuncionario", 1L);
        
        cstmt.registerOutParameter("p_codError", OracleTypes.INTEGER);
        cstmt.registerOutParameter("p_msjError", OracleTypes.VARCHAR);

        cstmt.execute();

        if (cstmt.getInt("p_codError") != 0)
            throw new Exception("Se genero error " + cstmt.getInt("p_codError") + "-" + cstmt.getString("p_msjError"));

        LOGGER.info("Ejecuto " + "Pr_ActualizarUsuario" + " OK. " + cstmt.getString("p_msjError"));

        cstmt.close();
        
    }

    public void ActualizarUsuarioSNIF (co.gov.ideam.integracion.snif.webservices.funcionarios.Funcionario funcionario, String siglaAutoridad, String sistema ) throws SQLException,
                                                         Exception {
        CallableStatement cstmt = null;
        ResultSet rs = null;

        cstmt = conn.prepareCall("{call PK_ADM_USUARIO.Pr_ActualizarUsuario" +  "(?,?,?,?,?,?,?,?,?,?)}");
        
        cstmt.setString("p_sistema", sistema);
        cstmt.setString("p_siglaAutoridad", siglaAutoridad);
        cstmt.setString("p_aliasUsuario", funcionario.getAliasUsuarios());
        cstmt.setString("P_tipoIdentificacion", "" + funcionario.getCodigoTipoIdentificacion());
        cstmt.setString("p_direccionCorreoElectronico", funcionario.getDieccionCorreoElectronico());
        cstmt.setString("p_identificacionPersona", funcionario.getIdentificacionPersona().toString());
        cstmt.setString("p_nombreFuncionario", funcionario.getNombreFuncionario());
        cstmt.setLong("p_esFuncionario", 1L);
        
        cstmt.registerOutParameter("p_codError", OracleTypes.INTEGER);
        cstmt.registerOutParameter("p_msjError", OracleTypes.VARCHAR);

        cstmt.execute();

        if (cstmt.getInt("p_codError") != 0)
            throw new Exception("Se genero error " + cstmt.getInt("p_codError") + "-" + cstmt.getString("p_msjError"));

        LOGGER.info("Ejecuto " + "Pr_ActualizarUsuario" + " OK. " + cstmt.getString("p_msjError"));
        
        cstmt.close();

        
    }

    public void ActualizarUsuarioRUA (co.gov.ideam.rua.electrico.webservices.VwRuaFuncionarios funcionario, String siglaAutoridad, String sistema ) throws SQLException,
                                                         Exception {
        CallableStatement cstmt = null;
        ResultSet rs = null;

        cstmt = conn.prepareCall("{call PK_ADM_USUARIO.Pr_ActualizarUsuario" +  "(?,?,?,?,?,?,?,?,?,?)}");
        
        cstmt.setString("p_sistema", sistema);
        cstmt.setString("p_siglaAutoridad", siglaAutoridad);
        cstmt.setString("p_aliasUsuario", funcionario.getAliasusuario());
        cstmt.setString("P_tipoIdentificacion", "" + funcionario.getCodigotipoidentificacion());
        cstmt.setString("p_direccionCorreoElectronico", funcionario.getDireccioncorreoelectronico());
        cstmt.setString("p_identificacionPersona", funcionario.getIdentificacionpersona());
        cstmt.setString("p_nombreFuncionario", funcionario.getNombrefuncionario());
        
        if (funcionario.getAliasusuario().startsWith("USR")) {
        
            cstmt.setLong("p_esFuncionario", 0L);
            cstmt.setString("p_sistema", "RUA");
        }
        else {
            cstmt.setLong("p_esFuncionario", 1L);
            cstmt.setString("p_sistema", "RUAADMIN");
        }
        
        cstmt.registerOutParameter("p_codError", OracleTypes.INTEGER);
        cstmt.registerOutParameter("p_msjError", OracleTypes.VARCHAR);

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
