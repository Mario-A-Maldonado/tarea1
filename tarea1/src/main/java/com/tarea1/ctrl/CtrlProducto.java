package com.tarea1.ctrl;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.tarea1.model.Producto;
import com.tarea1.serv.impl.CrudProducto;

@RestController
@RequestMapping("/productos")
public class CtrlProducto {
	
	
	@Autowired	
	private CrudProducto service;
	
	@PostMapping
	public ResponseEntity<Void> registrar(@Valid @RequestBody Producto producto) throws Exception{
		Producto obj = service.registrar(producto);
		
		//localhost:8080/pacientes/5
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getIdProducto()).toUri();
		
		return ResponseEntity.created(location).build();
	}
//*/
	
	
	
	
}
