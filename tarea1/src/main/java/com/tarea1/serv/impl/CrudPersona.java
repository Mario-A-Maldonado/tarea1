package com.tarea1.serv.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.tarea1.model.Persona;
import com.tarea1.repo.IRepo;
import com.tarea1.repo.IRepoPersona;
import com.tarea1.serv.ICrudPersona;


@Service
public class CrudPersona extends CrudImpl<Persona,Integer> implements ICrudPersona{
	

	@Autowired
	private IRepoPersona repo;
	
		
	@Override
	protected IRepo<Persona, Integer> getRepo() {
		return repo;
	}


	

}
