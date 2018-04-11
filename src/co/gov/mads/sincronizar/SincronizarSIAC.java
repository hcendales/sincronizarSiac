package co.gov.mads.sincronizar;

import co.gov.ideam.rua.electrico.webservices.WS_IDEAM_RUA_RegistrarPermiso;
import co.gov.ideam.rua.electrico.webservices.WS_IDEAM_RUA_RegistrarPermiso_Service;
import co.gov.ideam.sirh.webservices.businessl.registrarpermiso.OeRegistrarPermiso;
import co.gov.ideam.sirh.webservices.businessl.registrarpermiso.OsRegistrarPermiso;
import co.gov.ideam.sirh.webservices.businessl.registrarpermiso.PermisoWS;
import co.gov.ideam.sirh.webservices.businessl.registrarpermiso.PredioWS;
import co.gov.ideam.sirh.webservices.businessl.registrarpermiso.RepresentanteWS;
import co.gov.ideam.sirh.webservices.businessl.registrarpermiso.UsuarioAguaWS;
import co.gov.ideam.sirh.webservices.businessl.registrarpermiso.WS_SIAC_SIRH_RegistrarPermiso;
import co.gov.ideam.sirh.webservices.businessl.registrarpermiso.WS_SIAC_SIRH_RegistrarPermiso_Service;

import java.io.FileInputStream;
import java.io.IOException;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.util.Calendar;
import java.util.Properties;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import oracle.jdbc.OracleTypes;

public class SincronizarSIAC {

    private static final Logger LOGGER = Logger.getLogger("SincronizarSiac");

    private static String rutaConfiguracion = "./sincronizar_siac.config";
    private static Properties propiedades = null;


    public SincronizarSIAC() {
        super();
    }

    public static void main(String[] args) {
        SincronizarSIAC app = new SincronizarSIAC();
        app.ProcesarComando(args);
    }

    public void ProcesarComando (String[] args) {
        Connection conn = null;
        
        try {
            
            ConfigurarLog();
            CargarConfiguracion();
            conn = AbrirConexionBD();

            if (args[0].equals("SINCRONIZAR_PERMISOS")){
                SincronizarPermiso s = new SincronizarPermiso(conn, propiedades );
                s.Aplicar();
            }
  
            if (args[0].equals("SINCRONIZAR_USUARIOS")){
                SincronizarUsuario s = new SincronizarUsuario(conn, propiedades );
                s.Aplicar();
            }
            
            if (args[0].equals("CONSULTAR_PERMISOS")){
                ConsultarPermisos s = new ConsultarPermisos(conn, propiedades );
                s.Aplicar();
            }


        } catch (Exception e) {
            System.out.println("Error general:" + e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                }
            }
        }
                                
        
    }
 
    public void ConfigurarLog() throws IOException {
        Handler consoleHandler = null;
        Handler fileHandler = null;
        // Oobtener fecha del sistema
        Calendar cal1 = Calendar.getInstance();

        // Asignar nombre Log
        String nombreLog =
            "./sincronizar_siac_" + cal1.get(Calendar.YEAR) + "_" +
            (cal1.get(Calendar.MONTH) + 1) + "_" + cal1.get(Calendar.DATE) +
            " " + cal1.get(Calendar.HOUR) + "_" + cal1.get(Calendar.MINUTE) +
            "_" + cal1.get(Calendar.SECOND) + "_" +
            cal1.get(Calendar.MILLISECOND) + ".log";

        //Creating consoleHandler and fileHandler
        consoleHandler = new ConsoleHandler();
        //fileHandler = new FileHandler(nombreLog);

        // Poner formato del log, se deja el defecto que es xml
        //fileHandler.setFormatter(new SimpleFormatter());

        //Assigning handlers to LOGGER object
        LOGGER.addHandler(consoleHandler);
        //LOGGER.addHandler(fileHandler);

        //Setting levels to handlers and LOGGER
        consoleHandler.setLevel(Level.ALL);
        //fileHandler.setLevel(Level.ALL);
        LOGGER.setLevel(Level.ALL);

    }

    public void CargarConfiguracion() throws IOException {

        propiedades = new Properties();
        propiedades.load(new FileInputStream(rutaConfiguracion));

    }

    public Connection AbrirConexionBD() throws ClassNotFoundException,
                                               SQLException {

        Statement stmt = null;
        Connection conn = null;

        LOGGER.info("Va a cargar driver BD");
        LOGGER.info("DriverNameBD:" +
                    propiedades.getProperty("DriverNameBD" + propiedades.getProperty("DBName")) +
                    ":");
        LOGGER.info("UrlBD:" +
                    propiedades.getProperty("UrlBD" + propiedades.getProperty("DBName")) +
                    ":");
        LOGGER.info("UsuarioBD:" +
                    propiedades.getProperty("UsuarioBD" + propiedades.getProperty("DBName")) +
                    ":");
        LOGGER.info("ClaveUsuarioBD:" +
                    propiedades.getProperty("ClaveUsuarioBD" +
                                            propiedades.getProperty("DBName")) +
                    ":");

        Class.forName(propiedades.getProperty("DriverNameBD" +
                                              propiedades.getProperty("DBName")));


        LOGGER.info("Obtiene conexion a BD");

        conn =
DriverManager.getConnection(propiedades.getProperty("UrlBD" + propiedades.getProperty("DBName")),
                            propiedades.getProperty("UsuarioBD" +
                                                    propiedades.getProperty("DBName")),
                            propiedades.getProperty("ClaveUsuarioBD" +
                                                    propiedades.getProperty("DBName")));

        return conn;

    }

  
}
