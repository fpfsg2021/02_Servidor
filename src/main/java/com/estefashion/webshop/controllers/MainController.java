package com.estefashion.webshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.estefashion.webshop.entities.Producto;
import com.estefashion.webshop.services.IProductosService;

@Controller
public class MainController {
	@Autowired
	IProductosService servicioProductos;
	
	@RequestMapping(value="/")
	public ModelAndView mostrarPrincipal() {
		List<Producto> productos = servicioProductos.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("principal");//Indicación del template o plantilla
		mav.addObject("listado_productos",productos);//Indicación de los datos
		return mav;
	}
}
