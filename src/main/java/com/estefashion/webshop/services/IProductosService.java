package com.estefashion.webshop.services;

import java.util.List;
import java.util.Optional;

import com.estefashion.webshop.entities.Producto;

public interface IProductosService {
	//CRUD - (Create, Read, Update, Delete)
	public void add(Producto p);//C
	public List<Producto> findAll();//R
	public Optional<Producto> findById(Integer id);//R
	public void update(Producto p);//U
	public void delete(Producto p);//D
	public void deleteById(int id);//D
}