/**
 * InscripcionServiceMessageReceiverInOut.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.0 Built on : Aug 01,
 * 2021 (07:27:19 HST)
 */
package com.inscripcion;

/** InscripcionServiceMessageReceiverInOut message receiver */
public class InscripcionServiceMessageReceiverInOut
    extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {

  public void invokeBusinessLogic(
      org.apache.axis2.context.MessageContext msgContext,
      org.apache.axis2.context.MessageContext newMsgContext)
      throws org.apache.axis2.AxisFault {

    try {

      // get the implementation class for the Web Service
      Object obj = getTheImplementationObject(msgContext);

      InscripcionServiceSkeleton skel = (InscripcionServiceSkeleton) obj;
      // Out Envelop
      org.apache.axiom.soap.SOAPEnvelope envelope = null;
      // Find the axisOperation that has been set by the Dispatch phase.
      org.apache.axis2.description.AxisOperation op =
          msgContext.getOperationContext().getAxisOperation();
      if (op == null) {
        throw new org.apache.axis2.AxisFault(
            "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
      }

      java.lang.String methodName;
      if ((op.getName() != null)
          && ((methodName =
                  org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                      op.getName().getLocalPart()))
              != null)) {

        if ("validarAlumnoOperation".equals(methodName)) {

          com.inscripcion.ValidarAlumnoResponse validarAlumnoResponse17 = null;
          com.inscripcion.ValidarAlumnoRequest wrappedParam =
              (com.inscripcion.ValidarAlumnoRequest)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      com.inscripcion.ValidarAlumnoRequest.class);

          validarAlumnoResponse17 = skel.validarAlumnoOperation(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  validarAlumnoResponse17,
                  false,
                  new javax.xml.namespace.QName("http://inscripcion.com", "validarAlumnoResponse"));
        } else if ("registrarHorarioOperation".equals(methodName)) {

          com.inscripcion.RegistrarHorarioResponse registrarHorarioResponse19 = null;
          com.inscripcion.RegistrarHorarioRequest wrappedParam =
              (com.inscripcion.RegistrarHorarioRequest)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      com.inscripcion.RegistrarHorarioRequest.class);

          registrarHorarioResponse19 = skel.registrarHorarioOperation(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  registrarHorarioResponse19,
                  false,
                  new javax.xml.namespace.QName(
                      "http://inscripcion.com", "registrarHorarioResponse"));
        } else if ("validarPagoOperation".equals(methodName)) {

          com.inscripcion.ValidarPagoResponse validarPagoResponse21 = null;
          com.inscripcion.ValidarPagoRequest wrappedParam =
              (com.inscripcion.ValidarPagoRequest)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      com.inscripcion.ValidarPagoRequest.class);

          validarPagoResponse21 = skel.validarPagoOperation(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  validarPagoResponse21,
                  false,
                  new javax.xml.namespace.QName("http://inscripcion.com", "validarPagoResponse"));
        } else if ("mainOperation".equals(methodName)) {

          com.inscripcion.MainResponse mainResponse23 = null;
          com.inscripcion.MainRequest wrappedParam =
              (com.inscripcion.MainRequest)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      com.inscripcion.MainRequest.class);

          mainResponse23 = skel.mainOperation(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  mainResponse23,
                  false,
                  new javax.xml.namespace.QName("http://inscripcion.com", "mainResponse"));

        } else {
          throw new java.lang.RuntimeException("method not found");
        }

        newMsgContext.setEnvelope(envelope);
      }
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  //
  private org.apache.axiom.om.OMElement toOM(
      com.inscripcion.ValidarAlumnoRequest param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          com.inscripcion.ValidarAlumnoRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      com.inscripcion.ValidarAlumnoResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          com.inscripcion.ValidarAlumnoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      com.inscripcion.RegistrarHorarioRequest param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          com.inscripcion.RegistrarHorarioRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      com.inscripcion.RegistrarHorarioResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          com.inscripcion.RegistrarHorarioResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      com.inscripcion.ValidarPagoRequest param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          com.inscripcion.ValidarPagoRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      com.inscripcion.ValidarPagoResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          com.inscripcion.ValidarPagoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      com.inscripcion.MainRequest param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          com.inscripcion.MainRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      com.inscripcion.MainResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          com.inscripcion.MainResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      com.inscripcion.ValidarAlumnoResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(com.inscripcion.ValidarAlumnoResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private com.inscripcion.ValidarAlumnoResponse wrapvalidarAlumnoOperation() {
    com.inscripcion.ValidarAlumnoResponse wrappedElement =
        new com.inscripcion.ValidarAlumnoResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      com.inscripcion.RegistrarHorarioResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(com.inscripcion.RegistrarHorarioResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private com.inscripcion.RegistrarHorarioResponse wrapregistrarHorarioOperation() {
    com.inscripcion.RegistrarHorarioResponse wrappedElement =
        new com.inscripcion.RegistrarHorarioResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      com.inscripcion.ValidarPagoResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(com.inscripcion.ValidarPagoResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private com.inscripcion.ValidarPagoResponse wrapvalidarPagoOperation() {
    com.inscripcion.ValidarPagoResponse wrappedElement = new com.inscripcion.ValidarPagoResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      com.inscripcion.MainResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(com.inscripcion.MainResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private com.inscripcion.MainResponse wrapmainOperation() {
    com.inscripcion.MainResponse wrappedElement = new com.inscripcion.MainResponse();
    return wrappedElement;
  }

  /** get the default envelope */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
    return factory.getDefaultEnvelope();
  }

  private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type)
      throws org.apache.axis2.AxisFault {

    try {

      if (com.inscripcion.MainRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = com.inscripcion.MainRequest.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (com.inscripcion.MainResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = com.inscripcion.MainResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (com.inscripcion.RegistrarHorarioRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = com.inscripcion.RegistrarHorarioRequest.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (com.inscripcion.RegistrarHorarioResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = com.inscripcion.RegistrarHorarioResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (com.inscripcion.ValidarAlumnoRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = com.inscripcion.ValidarAlumnoRequest.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (com.inscripcion.ValidarAlumnoResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = com.inscripcion.ValidarAlumnoResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (com.inscripcion.ValidarPagoRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = com.inscripcion.ValidarPagoRequest.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (com.inscripcion.ValidarPagoResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = com.inscripcion.ValidarPagoResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
    return null;
  }

  private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
    org.apache.axis2.AxisFault f;
    Throwable cause = e.getCause();
    if (cause != null) {
      f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
    } else {
      f = new org.apache.axis2.AxisFault(e.getMessage());
    }

    return f;
  }
} // end of class
