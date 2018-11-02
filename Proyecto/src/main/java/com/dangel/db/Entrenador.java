package com.dangel.db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

@Entity
@Table(name="ENTRENADOR")
public class Entrenador implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="COD_ENTRENADOR")
	private Long codigo;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="APELLIDO")
	private String apellido;
	
//	@Column(name="FECHA_NACIMIENTO")
//	private LocalDate fechaNacimiento;
	
	public Entrenador(){}
	
	

	public Entrenador(Long codigo, String nombre, String apellido) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		//this.fechaNacimiento = fechaNacimiento;
	}



	@Override
	public String toString() {
		return "Entrenador [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}



	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

//	public LocalDate getFechaNacimiento() {
//		return fechaNacimiento;
//	}
//
//	public void setFechaNacimiento(LocalDate fechaNacimiento) {
//		this.fechaNacimiento = fechaNacimiento;
//	}
	
	
	
	
}
