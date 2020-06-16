package com.tarea1.serv.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea1.model.Producto;
import com.tarea1.repo.IRepo;
import com.tarea1.repo.IRepoProducto;
import com.tarea1.serv.ICrudProducto;

@Service
public class CrudProducto extends CrudImpl<Producto,Integer> implements ICrudProducto{
	

	@Autowired
	private IRepoProducto repo;
	
		
	@Override
	protected IRepo<Producto, Integer> getRepo() {
		return repo;
	}


	

}

