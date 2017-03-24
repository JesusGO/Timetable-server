package com.jolivas;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id = -1;
	
	private Day dia;
	private Hora hora;
	
	public Horario(){
		
	}
	public Horario(Day dia,Hora hora){
		this.dia=dia;
		this.hora=hora;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Day getDia() {
		return dia;
	}
	public void setDia(Day dia) {
		this.dia = dia;
	}
	public Hora getHora() {
		return hora;
	}
	public void setHora(Hora hora) {
		this.hora = hora;
	}
	@Override
	public String toString() {
		return "Horario [id=" + id + ", dia=" + dia + ", hora=" + hora + "]";
	}

	
}
