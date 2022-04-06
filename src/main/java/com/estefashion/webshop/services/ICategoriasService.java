package com.estefashion.webshop.services;
import java.util.List;

import com.estefashion.webshop.entities.Categoria;


public interface ICategoriasService {
	public void add(Categoria c);
	public List<Categoria> findAll();
	public void delete(Integer identificador);
}
