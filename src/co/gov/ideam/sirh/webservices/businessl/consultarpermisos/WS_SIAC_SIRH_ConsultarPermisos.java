package co.gov.ideam.sirh.webservices.businessl.consultarpermisos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebService(wsdlLocation="http://181.225.72.35:8230/Ideam-Ejb/WS_SIAC_SIRH_ConsultarPermisos/WS_SIAC_SIRH_ConsultarPermisos?WSDL",
  targetNamespace="http://consultarPermisos.businessl.webservices.sirh.ideam.gov.co/",
  name="WS_SIAC_SIRH_ConsultarPermisos")
@XmlSeeAlso(
  { co.gov.ideam.sirh.webservices.businessl.consultarpermisos.ObjectFactory.class })
public interface WS_SIAC_SIRH_ConsultarPermisos
{
  @WebMethod(operationName="ConsultarPermisos")
  @Action(input="http://consultarPermisos.businessl.webservices.sirh.ideam.gov.co/WS_SIAC_SIRH_ConsultarPermisos/ConsultarPermisos",
    output="http://consultarPermisos.businessl.webservices.sirh.ideam.gov.co/WS_SIAC_SIRH_ConsultarPermisos/ConsultarPermisosResponse")
  @ResponseWrapper(localName="ConsultarPermisosResponse", targetNamespace="http://consultarPermisos.businessl.webservices.sirh.ideam.gov.co/",
    className="co.gov.ideam.sirh.webservices.businessl.consultarpermisos.ConsultarPermisosResponse")
  @RequestWrapper(localName="ConsultarPermisos", targetNamespace="http://consultarPermisos.businessl.webservices.sirh.ideam.gov.co/",
    className="co.gov.ideam.sirh.webservices.businessl.consultarpermisos.ConsultarPermisos")
  @WebResult(targetNamespace="", name="ConsultarPermisos")
  public co.gov.ideam.sirh.webservices.businessl.consultarpermisos.OsConsultarPermisos consultarPermisos(@WebParam(targetNamespace="",
      name="arg0")
    co.gov.ideam.sirh.webservices.businessl.consultarpermisos.OeConsultarPermisos arg0);
}
