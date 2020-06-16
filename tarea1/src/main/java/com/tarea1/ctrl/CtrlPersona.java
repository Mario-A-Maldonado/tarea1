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


import com.tarea1.model.Persona;
import com.tarea1.serv.impl.CrudPersona;

@RestController
@RequestMapping("/personas")
public class CtrlPersona {
	
	
	@Autowired	
	private CrudPersona service;
	
	@PostMapping
	public ResponseEntity<Void> registrar(@Valid @RequestBody Persona persona) throws Exception{
		Persona obj = service.registrar(persona);
		
		//localhost:8080/pacientes/5
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getIdPersona()).toUri();
		
		return ResponseEntity.created(location).build();
	}
//*/
	
	
	
	
}
