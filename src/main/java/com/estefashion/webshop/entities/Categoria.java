package com.estefashion.webshop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="categorias") //Se indica el nombre de la tabla
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identificador;
	private String nombre;
	private String imagen;
	
	//De aquí hasta abajo todo se genera con el generador de código
	public Categoria() {
		super();
	}
	
	public Categoria(String nombre, String imagen) {
		super();
		this.nombre = nombre;
		this.imagen = imagen;
	}

	public Categoria(int identificador, String nombre, String imagen) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.imagen = imagen;
	}
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
}
