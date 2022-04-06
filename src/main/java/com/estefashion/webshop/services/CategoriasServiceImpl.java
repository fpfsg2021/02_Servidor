package com.estefashion.webshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estefashion.webshop.entities.Categoria;
import com.estefashion.webshop.repositories.ICategoriasRepository;

@Service
public class CategoriasServiceImpl implements ICategoriasService {
	@Autowired
	ICategoriasRepository repo;//repo es un Repositorio de Categorias
	
	@Override
	public void add(Categoria c) {
		repo.save(c);
	}

	@Override
	public List<Categoria> findAll() {
		return repo.findAll();
	}

	@Override
	public void delete(Integer identificador) {
		repo.deleteById(identificador);
		
	}
}
