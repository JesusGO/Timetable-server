package com.jolivas;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(methods = { RequestMethod.GET})
@RequestMapping("/timetable")

public class TimetableService {
	
	@Autowired
	private AlumnosRepository alumnos;
	
	@GetMapping("/")
	public Collection<Alumno> getSchedule(){
		return alumnos.findAll();
	}
	
	@GetMapping("/{nombre}")
	public ResponseEntity<Alumno> getAlumno(@PathVariable String nombre){
		
		Alumno alumno=alumnos.findByNombre(nombre);
		
		if(alumno!=null)
			return new ResponseEntity<>(alumno,HttpStatus.OK);
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

}
