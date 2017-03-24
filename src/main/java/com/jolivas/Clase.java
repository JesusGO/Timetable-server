package com.jolivas;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Clase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id = -1;
	
	private String nombre;
	private String aula;
	private String edificio;
	private String profesor;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Horario> horarios;
	
	public Clase(){
		
	}
	public Clase(String nombre,String aula,String edificio,String profesor,List<Horario> horarios){
		super();
		this.nombre=nombre;
		this.aula=aula;
		this.edificio=edificio;
		this.profesor=profesor;
		this.horarios=horarios;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public String getEdificio() {
		return edificio;
	}
	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	public List<Horario> getHorarios() {
		return horarios;
	}
	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}
	@Override
	public String toString() {
		return "Clase [id=" + id + ", nombre=" + nombre + ", aula=" + aula + ", edificio=" + edificio + ", profesor="
				+ profesor + ", horarios=" + horarios + "]";
	}

	
}
