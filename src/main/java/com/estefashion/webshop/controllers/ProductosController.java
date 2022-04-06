package com.estefashion.webshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import com.estefashion.webshop.services.IProductosService;
import com.estefashion.webshop.entities.Producto;

@Controller
public class ProductosController {

	@Autowired
	IProductosService servicioProductos;
		
	@RequestMapping(value="/adminProductos")
		public ModelAndView administrarProductos(
			@RequestParam(required=false) String nombre, 
			@RequestParam(required=false) String descripcion,
			@RequestParam(required=false) Float pvp,
			@RequestParam(required=false) String sn,
			@RequestParam(required=false) String imagen,
			@RequestParam(required=false) String color_predominante,
			@RequestParam(required=false) Integer stock,
			@RequestParam(required=false) Boolean temporada,
			@RequestParam(required=false) Boolean rebajado,
			@RequestParam(required=false) Integer id_categoria,
			@RequestParam(required=false) Integer id_tipo_cliente) {
		//Crear un producto 
		if (nombre!=null) {
			temporada = temporada==null? false : true;
			rebajado = rebajado==null? false: true;
			Producto nuevoProducto = new Producto(0, nombre, descripcion,
					pvp, sn, imagen, color_predominante, stock, temporada, rebajado, id_categoria, id_tipo_cliente);
			servicioProductos.add(nuevoProducto);
			return new ModelAndView("redirect:/adminProductos");
		}
		//Recuperar los productos de la base datos
		List<Producto> productos = servicioProductos.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crear_producto");
		mav.addObject("listado_productos",productos);
		return mav;
	}
}
