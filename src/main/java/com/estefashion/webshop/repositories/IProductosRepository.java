package com.estefashion.webshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estefashion.webshop.entities.Producto;

public interface IProductosRepository extends JpaRepository<Producto, Integer>{
}
