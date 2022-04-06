package com.estefashion.webshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estefashion.webshop.entities.Categoria;

public interface ICategoriasRepository extends JpaRepository<Categoria, Integer>{
}