package co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios;

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

@WebServiceClient(wsdlLocation="http://129.144.6.77:8001/WS_SIRH_ConsultarFuncionarios/proxy/ConsultarFuncionariosProxy?wsdl",
  targetNamespace="http://consultarFuncionarios.businessl.webservices.sirh.ideam.gov.co/",
  name="WS_SIAC_SIRH_ConsultarFuncionarios")
public class WS_SIAC_SIRH_ConsultarFuncionarios_Service
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.WS_SIAC_SIRH_ConsultarFuncionarios_Service");
      URL baseUrl =
        WS_SIAC_SIRH_ConsultarFuncionarios_Service.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            WS_SIAC_SIRH_ConsultarFuncionarios_Service.class.getResource("http://129.144.6.77:8001/WS_SIRH_ConsultarFuncionarios/proxy/ConsultarFuncionariosProxy?wsdl");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://129.144.6.77:8001/WS_SIRH_ConsultarFuncionarios/proxy/ConsultarFuncionariosProxy?wsdl");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://129.144.6.77:8001/WS_SIRH_ConsultarFuncionarios/proxy/ConsultarFuncionariosProxy?wsdl");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://129.144.6.77:8001/WS_SIRH_ConsultarFuncionarios/proxy/ConsultarFuncionariosProxy?wsdl",
          e);
    }
  }

  public WS_SIAC_SIRH_ConsultarFuncionarios_Service()
  {
    super(wsdlLocationURL,
          new QName("http://consultarFuncionarios.businessl.webservices.sirh.ideam.gov.co/",
                    "WS_SIAC_SIRH_ConsultarFuncionarios"));
  }

  public WS_SIAC_SIRH_ConsultarFuncionarios_Service(URL wsdlLocation,
                                                    QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="ConsultarFuncionariosSirhPort")
  public co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.WS_SIAC_SIRH_ConsultarFuncionarios getConsultarFuncionariosSirhPort()
  {
    return (co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.WS_SIAC_SIRH_ConsultarFuncionarios) super.getPort(new QName("http://consultarFuncionarios.businessl.webservices.sirh.ideam.gov.co/",
                                                                                                                                      "ConsultarFuncionariosSirhPort"),
                                                                                                                            co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.WS_SIAC_SIRH_ConsultarFuncionarios.class);
  }

  @WebEndpoint(name="ConsultarFuncionariosSirhPort")
  public co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.WS_SIAC_SIRH_ConsultarFuncionarios getConsultarFuncionariosSirhPort(WebServiceFeature... features)
  {
    return (co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.WS_SIAC_SIRH_ConsultarFuncionarios) super.getPort(new QName("http://consultarFuncionarios.businessl.webservices.sirh.ideam.gov.co/",
                                                                                                                                      "ConsultarFuncionariosSirhPort"),
                                                                                                                            co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios.WS_SIAC_SIRH_ConsultarFuncionarios.class,
                                                                                                                            features);
  }
}
