package com.estefashion.webshop.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.estefashion.webshop.entities.Producto;
import com.estefashion.webshop.repositories.IProductosRepository;

@Service
public class ProductosServiceImpl implements IProductosService {
	@Autowired
	IProductosRepository repo;
	
	@Override
	public void add(Producto p) {
		repo.save(p);
	}

	@Override
	public List<Producto> findAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Producto> findById(Integer id) {
		return repo.findById(id);
	}

	@Override
	public void update(Producto p) {
		repo.save(p);
	}

	@Override
	public void delete(Producto p) {
		repo.delete(p);
	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
	}
}
