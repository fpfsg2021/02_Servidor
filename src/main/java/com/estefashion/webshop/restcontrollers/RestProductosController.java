package com.estefashion.webshop.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.estefashion.webshop.entities.Categoria;
import com.estefashion.webshop.entities.Producto;
import com.estefashion.webshop.services.ICategoriasService;
import com.estefashion.webshop.services.IProductosService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RestProductosController {
	// INNER CLASS
	public class Respuesta {
		int codigo;
		String descripcion;

		public Respuesta() {
			super();
		}

		public Respuesta(int codigo, String descripcion) {
			this.codigo = codigo;
			this.descripcion = descripcion;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
	}

	@Autowired
	IProductosService productosService;

	@GetMapping(path = "/productos", produces = { MediaType.APPLICATION_JSON_VALUE })
	List<Producto> getProductos() {
		return productosService.findAll();
	}

	@DeleteMapping(path = "/productos", produces = { MediaType.APPLICATION_JSON_VALUE })
	Respuesta deleteProducto(@RequestParam(required = true) Integer id) {
		try {
			productosService.deleteById(id);
		} catch (Exception e) {
			return new Respuesta(-1, "Ha ocurrido un error");
		}
		return new Respuesta(0, "Borrado correcto");
	}

	@PostMapping(path = "/productos", produces = { MediaType.APPLICATION_JSON_VALUE })
	Respuesta getProductos2(@RequestParam(required = true) String nombre,
			@RequestParam(required = true) String descripcion, @RequestParam(required = true) Float pvp,
			@RequestParam(required = true) String sn, @RequestParam(required = true) String imagen,
			@RequestParam(required = true) String color_predominante, @RequestParam(required = true) Integer stock,
			@RequestParam(required = false) Boolean temporada, 
			@RequestParam(required = false) Boolean rebajado,
			@RequestParam(required = true) Integer id_categoria,
			@RequestParam(required = true) Integer id_tipo_cliente) {
			temporada = temporada==null? false : true;
			rebajado = rebajado==null? false: true;
			Producto nuevoProducto = new Producto(0, nombre, descripcion,
					pvp, sn, imagen, color_predominante, stock, temporada, rebajado, id_categoria, id_tipo_cliente);
			try {
				productosService.add(nuevoProducto);
			} catch (Exception e) {
				return new Respuesta(-1, "Ha ocurrido un error");
			}
			return new Respuesta(0, "Creación correcta");
	}

	@PutMapping(path = "/productos", produces = { MediaType.APPLICATION_JSON_VALUE })
	List<Producto> getProductos4() {
		return productosService.findAll();
	}
}