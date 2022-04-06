package com.estefashion.webshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.estefashion.webshop.entities.Categoria;
import com.estefashion.webshop.services.ICategoriasService;

@Controller
public class CategoriasController {
	@Autowired
	private ICategoriasService categoriasService;
	
	@RequestMapping(value = "/adminCategorias")
	public ModelAndView administrarCategorias(
			@RequestParam(required=false) String nombre, 
			@RequestParam(required=false) String imagen) {
		if (nombre!=null) {
			Categoria c = new Categoria(nombre, imagen);
			categoriasService.add(c);
			return new ModelAndView("redirect:/crearCategorias");
		}
		List<Categoria> categorias = categoriasService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crear_categoria");
		mav.addObject("tipos_categorias",categorias);
		return mav;
	}
	
	@RequestMapping(value = "/borrarCategorias")
	public ModelAndView borrarCategorias(
			@RequestParam(required=false) Integer id) {
			categoriasService.delete(id);
			return new ModelAndView("redirect:./adminCategorias");
		
	}
}