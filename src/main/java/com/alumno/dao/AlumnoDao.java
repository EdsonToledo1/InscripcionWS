package com.alumno.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import com.alumno.dto.AlumnoDto;

public class AlumnoDao {
    protected JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    public List<AlumnoDto> validarAlumno(AlumnoDto alumnoDto) {
        List<Map<String, Object>> list = jdbcTemplate.queryForList(
                "SELECT id, nombre, numeroControl, carrera, semestre FROM Alumno WHERE"
                + "numeroControl = '" + alumnoDto.getNumeroControl() + "'");
        List<AlumnoDto> alumnos = new ArrayList<>();
        for (Map<String, Object> map : list) {         
        	AlumnoDto someAlumnoDto = new AlumnoDto();
        	someAlumnoDto.setId((Integer)map.get("id"));
        	someAlumnoDto.setNombre((String)map.get("nombre"));
        	someAlumnoDto.setNumeroControl((String)map.get("numeroControl"));
        	someAlumnoDto.setCarrera((String)map.get("carrera"));
        	someAlumnoDto.setSemestre((Integer)map.get("semestre"));
            alumnos.add(someAlumnoDto);            
        }
        
        return alumnos;
    }
}
