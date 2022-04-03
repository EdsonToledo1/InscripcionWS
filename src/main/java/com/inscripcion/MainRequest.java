/**
 * MainRequest.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.0 Built on : Aug 01,
 * 2021 (07:27:43 HST)
 */
package com.inscripcion;

/** MainRequest bean class */
@SuppressWarnings({"unchecked", "unused"})
public class MainRequest implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("http://inscripcion.com", "mainRequest", "ns1");

  /** field for NombreAlumno */
  protected java.lang.String localNombreAlumno;

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getNombreAlumno() {
    return localNombreAlumno;
  }

  /**
   * Auto generated setter method
   *
   * @param param NombreAlumno
   */
  public void setNombreAlumno(java.lang.String param) {

    this.localNombreAlumno = param;
  }

  /** field for NumeroControl */
  protected java.lang.String localNumeroControl;

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getNumeroControl() {
    return localNumeroControl;
  }

  /**
   * Auto generated setter method
   *
   * @param param NumeroControl
   */
  public void setNumeroControl(java.lang.String param) {

    this.localNumeroControl = param;
  }

  /** field for Semestre */
  protected int localSemestre;

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getSemestre() {
    return localSemestre;
  }

  /**
   * Auto generated setter method
   *
   * @param param Semestre
   */
  public void setSemestre(int param) {

    this.localSemestre = param;
  }

  /** field for Horario This was an Array! */
  protected com.inscripcion.MateriaType[] localHorario;

  /**
   * Auto generated getter method
   *
   * @return com.inscripcion.MateriaType[]
   */
  public com.inscripcion.MateriaType[] getHorario() {
    return localHorario;
  }

  /** validate the array for Horario */
  protected void validateHorario(com.inscripcion.MateriaType[] param) {

    if ((param != null) && (param.length < 1)) {
      throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
    }
  }

  /**
   * Auto generated setter method
   *
   * @param param Horario
   */
  public void setHorario(com.inscripcion.MateriaType[] param) {

    validateHorario(param);

    this.localHorario = param;
  }

  /**
   * Auto generated add method for the array for convenience
   *
   * @param param com.inscripcion.MateriaType
   */
  public void addHorario(com.inscripcion.MateriaType param) {
    if (localHorario == null) {
      localHorario = new com.inscripcion.MateriaType[] {};
    }

    java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localHorario);
    list.add(param);
    this.localHorario =
        (com.inscripcion.MateriaType[]) list.toArray(new com.inscripcion.MateriaType[list.size()]);
  }

  /** field for NumeroCuenta */
  protected java.lang.String localNumeroCuenta;

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getNumeroCuenta() {
    return localNumeroCuenta;
  }

  /**
   * Auto generated setter method
   *
   * @param param NumeroCuenta
   */
  public void setNumeroCuenta(java.lang.String param) {

    this.localNumeroCuenta = param;
  }

  /**
   * @param parentQName
   * @param factory
   * @return org.apache.axiom.om.OMElement
   */
  public org.apache.axiom.om.OMElement getOMElement(
      final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
      throws org.apache.axis2.databinding.ADBException {

    return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
  }

  public void serialize(
      final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
    serialize(parentQName, xmlWriter, false);
  }

  public void serialize(
      final javax.xml.namespace.QName parentQName,
      javax.xml.stream.XMLStreamWriter xmlWriter,
      boolean serializeType)
      throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

    java.lang.String prefix = null;
    java.lang.String namespace = null;

    prefix = parentQName.getPrefix();
    namespace = parentQName.getNamespaceURI();
    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

    if (serializeType) {

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://inscripcion.com");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":mainRequest",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "mainRequest", xmlWriter);
      }
    }

    namespace = "http://inscripcion.com";
    writeStartElement(null, namespace, "nombreAlumno", xmlWriter);

    if (localNombreAlumno == null) {
      // write the nil attribute

      throw new org.apache.axis2.databinding.ADBException("nombreAlumno cannot be null!!");

    } else {

      xmlWriter.writeCharacters(localNombreAlumno);
    }

    xmlWriter.writeEndElement();

    namespace = "http://inscripcion.com";
    writeStartElement(null, namespace, "numeroControl", xmlWriter);

    if (localNumeroControl == null) {
      // write the nil attribute

      throw new org.apache.axis2.databinding.ADBException("numeroControl cannot be null!!");

    } else {

      xmlWriter.writeCharacters(localNumeroControl);
    }

    xmlWriter.writeEndElement();

    namespace = "http://inscripcion.com";
    writeStartElement(null, namespace, "semestre", xmlWriter);

    if (localSemestre == java.lang.Integer.MIN_VALUE) {

      throw new org.apache.axis2.databinding.ADBException("semestre cannot be null!!");

    } else {
      xmlWriter.writeCharacters(
          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSemestre));
    }

    xmlWriter.writeEndElement();

    if (localHorario != null) {
      for (int i = 0; i < localHorario.length; i++) {
        if (localHorario[i] != null) {
          localHorario[i].serialize(
              new javax.xml.namespace.QName("http://inscripcion.com", "horario"), xmlWriter);
        } else {

          throw new org.apache.axis2.databinding.ADBException("horario cannot be null!!");
        }
      }
    } else {

      throw new org.apache.axis2.databinding.ADBException("horario cannot be null!!");
    }

    namespace = "http://inscripcion.com";
    writeStartElement(null, namespace, "numeroCuenta", xmlWriter);

    if (localNumeroCuenta == null) {
      // write the nil attribute

      throw new org.apache.axis2.databinding.ADBException("numeroCuenta cannot be null!!");

    } else {

      xmlWriter.writeCharacters(localNumeroCuenta);
    }

    xmlWriter.writeEndElement();

    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("http://inscripcion.com")) {
      return "ns1";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
  }

  /** Utility method to write an element start tag. */
  private void writeStartElement(
      java.lang.String prefix,
      java.lang.String namespace,
      java.lang.String localPart,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
      xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
    } else {
      if (namespace.length() == 0) {
        prefix = "";
      } else if (prefix == null) {
        prefix = generatePrefix(namespace);
      }

      xmlWriter.writeStartElement(prefix, localPart, namespace);
      xmlWriter.writeNamespace(prefix, namespace);
      xmlWriter.setPrefix(prefix, namespace);
    }
  }

  /** Util method to write an attribute with the ns prefix */
  private void writeAttribute(
      java.lang.String prefix,
      java.lang.String namespace,
      java.lang.String attName,
      java.lang.String attValue,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
      xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
    } else {
      xmlWriter.writeNamespace(prefix, namespace);
      xmlWriter.setPrefix(prefix, namespace);
      xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
    }
  }

  /** Util method to write an attribute without the ns prefix */
  private void writeAttribute(
      java.lang.String namespace,
      java.lang.String attName,
      java.lang.String attValue,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    if (namespace.equals("")) {
      xmlWriter.writeAttribute(attName, attValue);
    } else {
      xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
    }
  }

  /** Util method to write an attribute without the ns prefix */
  private void writeQNameAttribute(
      java.lang.String namespace,
      java.lang.String attName,
      javax.xml.namespace.QName qname,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {

    java.lang.String attributeNamespace = qname.getNamespaceURI();
    java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
    if (attributePrefix == null) {
      attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
    }
    java.lang.String attributeValue;
    if (attributePrefix.trim().length() > 0) {
      attributeValue = attributePrefix + ":" + qname.getLocalPart();
    } else {
      attributeValue = qname.getLocalPart();
    }

    if (namespace.equals("")) {
      xmlWriter.writeAttribute(attName, attributeValue);
    } else {
      registerPrefix(xmlWriter, namespace);
      xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
    }
  }
  /** method to handle Qnames */
  private void writeQName(
      javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
      java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
      if (prefix == null) {
        prefix = generatePrefix(namespaceURI);
        xmlWriter.writeNamespace(prefix, namespaceURI);
        xmlWriter.setPrefix(prefix, namespaceURI);
      }

      if (prefix.trim().length() > 0) {
        xmlWriter.writeCharacters(
            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      } else {
        // i.e this is the default namespace
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }

    } else {
      xmlWriter.writeCharacters(
          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
  }

  private void writeQNames(
      javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
      // we have to store this data until last moment since it is not possible to write any
      // namespace data after writing the charactor data
      java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
      java.lang.String namespaceURI = null;
      java.lang.String prefix = null;

      for (int i = 0; i < qnames.length; i++) {
        if (i > 0) {
          stringToWrite.append(" ");
        }
        namespaceURI = qnames[i].getNamespaceURI();
        if (namespaceURI != null) {
          prefix = xmlWriter.getPrefix(namespaceURI);
          if ((prefix == null) || (prefix.length() == 0)) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix, namespaceURI);
          }

          if (prefix.trim().length() > 0) {
            stringToWrite
                .append(prefix)
                .append(":")
                .append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        } else {
          stringToWrite.append(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
        }
      }
      xmlWriter.writeCharacters(stringToWrite.toString());
    }
  }

  /** Register a namespace prefix */
  private java.lang.String registerPrefix(
      javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
      throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
      prefix = generatePrefix(namespace);
      javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
      while (true) {
        java.lang.String uri = nsContext.getNamespaceURI(prefix);
        if (uri == null || uri.length() == 0) {
          break;
        }
        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
      }
      xmlWriter.writeNamespace(prefix, namespace);
      xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
  }

  /** Factory class that keeps the parse method */
  public static class Factory {
    private static org.apache.commons.logging.Log log =
        org.apache.commons.logging.LogFactory.getLog(Factory.class);

    /**
     * static method to create the object Precondition: If this object is an element, the current or
     * next start element starts this object and any intervening reader events are ignorable If this
     * object is not an element, it is a complex type and the reader is at the event just after the
     * outer start element Postcondition: If this object is an element, the reader is positioned at
     * its end element If this object is a complex type, the reader is positioned at the end element
     * of its outer element
     */
    public static MainRequest parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      MainRequest object = new MainRequest();

      int event;
      javax.xml.namespace.QName currentQName = null;
      java.lang.String nillableValue = null;
      java.lang.String prefix = "";
      java.lang.String namespaceuri = "";
      try {

        while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

        currentQName = reader.getName();

        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
          java.lang.String fullTypeName =
              reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
          if (fullTypeName != null) {
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1) {
              nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix == null ? "" : nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

            if (!"mainRequest".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (MainRequest)
                  com.inscripcion.ExtensionMapper.getTypeObject(nsUri, type, reader);
            }
          }
        }

        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();

        reader.next();

        java.util.ArrayList list4 = new java.util.ArrayList();

        while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

        if (reader.isStartElement()
            && new javax.xml.namespace.QName("http://inscripcion.com", "nombreAlumno")
                .equals(reader.getName())) {

          nillableValue =
              reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
          if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
            throw new org.apache.axis2.databinding.ADBException(
                "The element: " + "nombreAlumno" + "  cannot be null");
          }

          java.lang.String content = reader.getElementText();

          object.setNombreAlumno(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

          reader.next();

        } // End of if for expected property start element
        else {
          // 1 - A start element we are not expecting indicates an invalid parameter was passed
          throw new org.apache.axis2.databinding.ADBException(
              "Unexpected subelement " + reader.getName());
        }

        while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

        if (reader.isStartElement()
            && new javax.xml.namespace.QName("http://inscripcion.com", "numeroControl")
                .equals(reader.getName())) {

          nillableValue =
              reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
          if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
            throw new org.apache.axis2.databinding.ADBException(
                "The element: " + "numeroControl" + "  cannot be null");
          }

          java.lang.String content = reader.getElementText();

          object.setNumeroControl(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

          reader.next();

        } // End of if for expected property start element
        else {
          // 1 - A start element we are not expecting indicates an invalid parameter was passed
          throw new org.apache.axis2.databinding.ADBException(
              "Unexpected subelement " + reader.getName());
        }

        while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

        if (reader.isStartElement()
            && new javax.xml.namespace.QName("http://inscripcion.com", "semestre")
                .equals(reader.getName())) {

          nillableValue =
              reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
          if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
            throw new org.apache.axis2.databinding.ADBException(
                "The element: " + "semestre" + "  cannot be null");
          }

          java.lang.String content = reader.getElementText();

          object.setSemestre(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

          reader.next();

        } // End of if for expected property start element
        else {
          // 1 - A start element we are not expecting indicates an invalid parameter was passed
          throw new org.apache.axis2.databinding.ADBException(
              "Unexpected subelement " + reader.getName());
        }

        while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

        if (reader.isStartElement()
            && new javax.xml.namespace.QName("http://inscripcion.com", "horario")
                .equals(reader.getName())) {

          // Process the array and step past its final element's end.

          list4.add(com.inscripcion.MateriaType.Factory.parse(reader));

          // loop until we find a start element that is not part of this array
          boolean loopDone4 = false;
          while (!loopDone4) {
            // We should be at the end element, but make sure
            while (!reader.isEndElement()) reader.next();
            // Step out of this element
            reader.next();
            // Step to next element event.
            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
            if (reader.isEndElement()) {
              // two continuous end elements means we are exiting the xml structure
              loopDone4 = true;
            } else {
              if (new javax.xml.namespace.QName("http://inscripcion.com", "horario")
                  .equals(reader.getName())) {
                list4.add(com.inscripcion.MateriaType.Factory.parse(reader));

              } else {
                loopDone4 = true;
              }
            }
          }
          // call the converter utility  to convert and set the array

          object.setHorario(
              (com.inscripcion.MateriaType[])
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                      com.inscripcion.MateriaType.class, list4));

        } // End of if for expected property start element
        else {
          // 1 - A start element we are not expecting indicates an invalid parameter was passed
          throw new org.apache.axis2.databinding.ADBException(
              "Unexpected subelement " + reader.getName());
        }

        while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

        if (reader.isStartElement()
            && new javax.xml.namespace.QName("http://inscripcion.com", "numeroCuenta")
                .equals(reader.getName())) {

          nillableValue =
              reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
          if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
            throw new org.apache.axis2.databinding.ADBException(
                "The element: " + "numeroCuenta" + "  cannot be null");
          }

          java.lang.String content = reader.getElementText();

          object.setNumeroCuenta(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

          reader.next();

        } // End of if for expected property start element
        else {
          // 1 - A start element we are not expecting indicates an invalid parameter was passed
          throw new org.apache.axis2.databinding.ADBException(
              "Unexpected subelement " + reader.getName());
        }

        while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

        if (reader.isStartElement())
          // 2 - A start element we are not expecting indicates a trailing invalid property

          throw new org.apache.axis2.databinding.ADBException(
              "Unexpected subelement " + reader.getName());

      } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
      }

      return object;
    }
  } // end of factory class
}
