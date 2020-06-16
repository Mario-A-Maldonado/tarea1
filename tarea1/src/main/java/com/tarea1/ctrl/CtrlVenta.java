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


import com.tarea1.model.Venta;
import com.tarea1.serv.impl.ServiceVenta;


@RestController
@RequestMapping("/ventas")
public class CtrlVenta {
	
	
	@Autowired	
	private ServiceVenta service;
	
	@PostMapping
	public ResponseEntity<Void> registrar(@Valid @RequestBody Venta venta) throws Exception{
		Venta obj = service.registrar(venta);
		
		//localhost:8080/pacientes/5
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getIdVenta()).toUri();
		
		return ResponseEntity.created(location).build();
		/*POST
		{
			"fecha" : "2020-06-19T05:00:00.000Z",
		    "idPersona" : {"idPersona" : 3},
			"detallesVenta" : [
				{ "producto" : {"idProducto" : 3}, "cantidad" : 4},
				{ "producto" : {"idProducto" : 2}, "cantidad" : 3}
			],
		    "importe" :  149
		}
    */
		
		
	}
//*/
	
	
	
	
}
