package co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios;

import javax.xml.ws.WebServiceRef;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

public class ConsultarFuncionariosSirhPortClient
{
  @WebServiceRef
  private static WS_SIAC_SIRH_ConsultarFuncionarios_Service wS_SIAC_SIRH_ConsultarFuncionarios_Service;

  public static void main(String [] args)
  {
    wS_SIAC_SIRH_ConsultarFuncionarios_Service = new WS_SIAC_SIRH_ConsultarFuncionarios_Service();
    WS_SIAC_SIRH_ConsultarFuncionarios wS_SIAC_SIRH_ConsultarFuncionarios = wS_SIAC_SIRH_ConsultarFuncionarios_Service.getConsultarFuncionariosSirhPort();
    // Add your code to call the desired methods.
  }
}
