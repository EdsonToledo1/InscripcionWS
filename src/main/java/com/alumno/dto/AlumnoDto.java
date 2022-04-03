package com.alumno.dto;

public class AlumnoDto {
	private int id;
	
	private String nombre;
	
	private String numeroControl;
	
	private String carrera;
	
	private int semestre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroControl() {
		return numeroControl;
	}

	public void setNumeroControl(String numeroControl) {
		this.numeroControl = numeroControl;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public String toString() {
		return "id: " + id + "nombre: " + nombre + "numeroControl: " + numeroControl + "carrera: " + carrera;
	}
}
