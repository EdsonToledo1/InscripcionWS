package com.inscripcion.business;

import java.util.List;

import com.alumno.dao.AlumnoDao;
import com.alumno.dto.AlumnoDto;

public class InscripcionBusiness {
	private AlumnoDao alumnoDao;

	public boolean validarAlumno(AlumnoDto alumnoDto) {
		List<AlumnoDto> alumnos = alumnoDao.validarAlumno(alumnoDto);
		
		if (alumnos.isEmpty()) {
			return false;
		}
		
		return true;
	}
	
	public AlumnoDao getAlumnoDao() {
		return alumnoDao;
	}

	public void setAlumnoDao(AlumnoDao alumnoDao) {
		this.alumnoDao = alumnoDao;
	}
}
