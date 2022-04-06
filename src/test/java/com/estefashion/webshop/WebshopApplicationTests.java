package com.estefashion.webshop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.estefashion.webshop.entities.Categoria;
import com.estefashion.webshop.repositories.ICategoriasRepository;

@SpringBootTest
class WebshopApplicationTests {

	@Autowired
	ICategoriasRepository categoriasRepository;
	
	@Test
	void borradoProductos() {
		Categoria c = new Categoria("Categoría de prueba","imagen.jpg");
		categoriasRepository.save(c);
	}
}
