/**
 * InscripcionServiceSkeleton.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.0 Built on : Aug 01,
 * 2021 (07:27:19 HST)
 */
package com.inscripcion;

import com.alumno.dto.AlumnoDto;
import com.inscripcion.business.InscripcionBusiness;

/** InscripcionServiceSkeleton java skeleton for the axisService */
public class InscripcionServiceImpl extends InscripcionServiceSkeleton {

  /**
   * Auto generated method signature
   *
   * @param validarAlumnoRequest
   * @return validarAlumnoResponse
   */
	InscripcionBusiness inscripcionBusiness;
	
	
	public InscripcionBusiness getInscripcionBusiness() {
		return inscripcionBusiness;
	}

	public void setInscripcionBusiness(InscripcionBusiness inscripcionBusiness) {
		this.inscripcionBusiness = inscripcionBusiness;
	}

	public ValidarAlumnoResponse validarAlumnoOperation(
	      ValidarAlumnoRequest validarAlumnoRequest) {
		  ValidarAlumnoResponse response = new ValidarAlumnoResponse();
		  AlumnoDto alumnoDto = new AlumnoDto();
		  alumnoDto.setNumeroControl(validarAlumnoRequest.getNumeroControl());
		  boolean status = inscripcionBusiness.validarAlumno(alumnoDto);
		  
		  response.setAlumnoRegistrado(status);
		  
		  if (status == true) {
			  response.setMensaje("El alumno existe");
		  } else {
			  response.setMensaje("El alumno no existe");
		  }
		  
		  
		  return response;
	  }

	  /**
	   * Auto generated method signature
	   *
	   * @param registrarHorarioRequest
	   * @return registrarHorarioResponse
	   */
	  public RegistrarHorarioResponse registrarHorarioOperation(
	      RegistrarHorarioRequest registrarHorarioRequest) {
	    // TODO : fill this with the necessary business logic
	    throw new java.lang.UnsupportedOperationException(
	        "Please implement " + this.getClass().getName() + "#registrarHorarioOperation");
	  }

	  /**
	   * Auto generated method signature
	   *
	   * @param validarPagoRequest
	   * @return validarPagoResponse
	   */
	  public ValidarPagoResponse validarPagoOperation(
	      ValidarPagoRequest validarPagoRequest) {
	    // TODO : fill this with the necessary business logic
	    throw new java.lang.UnsupportedOperationException(
	        "Please implement " + this.getClass().getName() + "#validarPagoOperation");
	  }

	  /**
	   * Auto generated method signature
	   *
	   * @param mainRequest
	   * @return mainResponse
	   */
	  public MainResponse mainOperation(MainRequest mainRequest) {
	    // TODO : fill this with the necessary business logic
	    throw new java.lang.UnsupportedOperationException(
	        "Please implement " + this.getClass().getName() + "#mainOperation");
	  }
}
