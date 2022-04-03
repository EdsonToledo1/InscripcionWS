/**
 * ExtensionMapper.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.0 Built on : Aug 01,
 * 2021 (07:27:43 HST)
 */
package com.inscripcion;

/** ExtensionMapper class */
@SuppressWarnings({"unchecked", "unused"})
public class ExtensionMapper {

  public static java.lang.Object getTypeObject(
      java.lang.String namespaceURI,
      java.lang.String typeName,
      javax.xml.stream.XMLStreamReader reader)
      throws java.lang.Exception {

    if ("http://inscripcion.com".equals(namespaceURI) && "materiaType".equals(typeName)) {

      return com.inscripcion.MateriaType.Factory.parse(reader);
    }

    if ("http://inscripcion.com".equals(namespaceURI) && "cuentaBancariaType".equals(typeName)) {

      return com.inscripcion.CuentaBancariaType.Factory.parse(reader);
    }

    throw new org.apache.axis2.databinding.ADBException(
        "Unsupported type " + namespaceURI + " " + typeName);
  }
}
