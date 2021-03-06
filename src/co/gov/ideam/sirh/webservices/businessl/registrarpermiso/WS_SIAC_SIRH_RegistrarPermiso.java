package co.gov.ideam.sirh.webservices.businessl.registrarpermiso;

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

@WebService(wsdlLocation="http://129.144.6.77:8001/WS_SIRH_RegistrarPermiso/proxy/RegistrarPermisoProxy?wsdl",
  targetNamespace="http://registrarPermiso.businessl.webservices.sirh.ideam.gov.co/",
  name="WS_SIAC_SIRH_RegistrarPermiso")
@XmlSeeAlso(
  { co.gov.ideam.sirh.webservices.businessl.registrarpermiso.ObjectFactory.class })
public interface WS_SIAC_SIRH_RegistrarPermiso
{
  @WebMethod(operationName="RegistrarPermiso")
  @Action(input="http://registrarPermiso.businessl.webservices.sirh.ideam.gov.co/WS_SIAC_SIRH_RegistrarPermiso/RegistrarPermiso",
    output="http://registrarPermiso.businessl.webservices.sirh.ideam.gov.co/WS_SIAC_SIRH_RegistrarPermiso/RegistrarPermisoResponse")
  @ResponseWrapper(localName="RegistrarPermisoResponse", targetNamespace="http://registrarPermiso.businessl.webservices.sirh.ideam.gov.co/",
    className="co.gov.ideam.sirh.webservices.businessl.registrarpermiso.RegistrarPermisoResponse")
  @RequestWrapper(localName="RegistrarPermiso", targetNamespace="http://registrarPermiso.businessl.webservices.sirh.ideam.gov.co/",
    className="co.gov.ideam.sirh.webservices.businessl.registrarpermiso.RegistrarPermiso")
  @WebResult(targetNamespace="", name="RegistrarPermiso")
  public co.gov.ideam.sirh.webservices.businessl.registrarpermiso.OsRegistrarPermiso registrarPermiso(@WebParam(targetNamespace="",
      name="arg0")
    co.gov.ideam.sirh.webservices.businessl.registrarpermiso.OeRegistrarPermiso arg0);
}
