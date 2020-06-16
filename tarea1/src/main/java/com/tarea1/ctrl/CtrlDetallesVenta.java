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

import com.tarea1.model.DetallesVenta;
import com.tarea1.serv.impl.ServiceDetallesV;


@RestController
@RequestMapping("/detalles")
public class CtrlDetallesVenta {
	
	
	@Autowired	
	private ServiceDetallesV service;
	
	@PostMapping
	public ResponseEntity<Void> registrar(@Valid @RequestBody DetallesVenta detVenta) throws Exception{
		DetallesVenta obj = service.registrar(detVenta);
		
		//localhost:8080/pacientes/5
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getIdDetalle()).toUri();
		
		return ResponseEntity.created(location).build();
				
	/*POST
		{
			 "idVenta" : {"idVenta" :2}, "producto" : {"idProducto" : 6}, "cantidad" : 11
		}
    */
	}

	
	
	
	
}
