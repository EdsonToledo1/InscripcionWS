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

        if ("registrarHorarioOperation".equals(methodName)) {

          skel.registrarHorarioOperation();

          envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
        } else if ("validarPagoOperation".equals(methodName)) {

          skel.validarPagoOperation();

          envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
        } else if ("mainOperation".equals(methodName)) {

          com.inscripcion.MainResponse mainResponse27 = null;
          com.inscripcion.MainRequest wrappedParam =
              (com.inscripcion.MainRequest)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      com.inscripcion.MainRequest.class);

          mainResponse27 = skel.mainOperation(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  mainResponse27,
                  false,
                  new javax.xml.namespace.QName("http://inscripcion.com", "mainResponse"));
        } else if ("validarUsuarioOperation".equals(methodName)) {

          skel.validarUsuarioOperation();

          envelope = getSOAPFactory(msgContext).getDefaultEnvelope();

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
