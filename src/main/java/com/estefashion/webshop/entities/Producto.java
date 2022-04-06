package com.estefashion.webshop.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="productos")
public class Producto implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identificador;
	private String nombre;
	private String descripcion;
	private float pvp;
	private String sn;
	private String imagen;
	private String color_predominante;
	private int stock;
	private boolean temporada;
	private boolean rebajado;
	private int id_categoria;
	private int id_tipo_cliente;
	
	public Producto() {
		super();
	}
	
	public Producto(int identificador, String nombre, String descripcion, float pvp, String sn, String imagen,
			String color_predominante, int stock, boolean temporada, boolean rebajado, int id_categoria,
			int id_tipo_cliente) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.pvp = pvp;
		this.sn = sn;
		this.imagen = imagen;
		this.color_predominante = color_predominante;
		this.stock = stock;
		this.temporada = temporada;
		this.rebajado = rebajado;
		this.id_categoria = id_categoria;
		this.id_tipo_cliente = id_tipo_cliente;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPvp() {
		return pvp;
	}
	public void setPvp(float pvp) {
		this.pvp = pvp;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getColor_predominante() {
		return color_predominante;
	}
	public void setColor_predominante(String color_predominante) {
		this.color_predominante = color_predominante;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isTemporada() {
		return temporada;
	}
	public void setTemporada(boolean temporada) {
		this.temporada = temporada;
	}
	public boolean isRebajado() {
		return rebajado;
	}
	public void setRebajado(boolean rebajado) {
		this.rebajado = rebajado;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public int getId_tipo_cliente() {
		return id_tipo_cliente;
	}
	public void setId_tipo_cliente(int id_tipo_cliente) {
		this.id_tipo_cliente = id_tipo_cliente;
	}
	
	
	
	
}


