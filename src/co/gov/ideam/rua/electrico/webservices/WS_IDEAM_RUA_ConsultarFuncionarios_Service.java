package co.gov.ideam.rua.electrico.webservices;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebServiceClient(wsdlLocation="http://181.225.72.108:9130/RUA/faces/WS_IDEAM_RUA_ConsultarFuncionarios?wsdl",
  targetNamespace="http://webservices.electrico.rua.ideam.gov.co/", name="WS_IDEAM_RUA_ConsultarFuncionarios")
public class WS_IDEAM_RUA_ConsultarFuncionarios_Service
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("co.gov.ideam.rua.electrico.webservices.WS_IDEAM_RUA_ConsultarFuncionarios_Service");
      URL baseUrl =
        WS_IDEAM_RUA_ConsultarFuncionarios_Service.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            WS_IDEAM_RUA_ConsultarFuncionarios_Service.class.getResource("http://181.225.72.108:9130/RUA/faces/WS_IDEAM_RUA_ConsultarFuncionarios?wsdl");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://181.225.72.108:9130/RUA/faces/WS_IDEAM_RUA_ConsultarFuncionarios?wsdl");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://181.225.72.108:9130/RUA/faces/WS_IDEAM_RUA_ConsultarFuncionarios?wsdl");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://181.225.72.108:9130/RUA/faces/WS_IDEAM_RUA_ConsultarFuncionarios?wsdl",
          e);
    }
  }

  public WS_IDEAM_RUA_ConsultarFuncionarios_Service()
  {
    super(wsdlLocationURL,
          new QName("http://webservices.electrico.rua.ideam.gov.co/",
                    "WS_IDEAM_RUA_ConsultarFuncionarios"));
  }

  public WS_IDEAM_RUA_ConsultarFuncionarios_Service(URL wsdlLocation,
                                                    QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="WS_IDEAM_RUA_ConsultarFuncionariosPort")
  public co.gov.ideam.rua.electrico.webservices.WS_IDEAM_RUA_ConsultarFuncionarios getWS_IDEAM_RUA_ConsultarFuncionariosPort()
  {
    return (co.gov.ideam.rua.electrico.webservices.WS_IDEAM_RUA_ConsultarFuncionarios) super.getPort(new QName("http://webservices.electrico.rua.ideam.gov.co/",
                                                                                                               "WS_IDEAM_RUA_ConsultarFuncionariosPort"),
                                                                                                     co.gov.ideam.rua.electrico.webservices.WS_IDEAM_RUA_ConsultarFuncionarios.class);
  }

  @WebEndpoint(name="WS_IDEAM_RUA_ConsultarFuncionariosPort")
  public co.gov.ideam.rua.electrico.webservices.WS_IDEAM_RUA_ConsultarFuncionarios getWS_IDEAM_RUA_ConsultarFuncionariosPort(WebServiceFeature... features)
  {
    return (co.gov.ideam.rua.electrico.webservices.WS_IDEAM_RUA_ConsultarFuncionarios) super.getPort(new QName("http://webservices.electrico.rua.ideam.gov.co/",
                                                                                                               "WS_IDEAM_RUA_ConsultarFuncionariosPort"),
                                                                                                     co.gov.ideam.rua.electrico.webservices.WS_IDEAM_RUA_ConsultarFuncionarios.class,
                                                                                                     features);
  }
}
