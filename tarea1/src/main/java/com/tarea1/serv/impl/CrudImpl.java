package com.tarea1.serv.impl;

import java.util.List;

import com.tarea1.repo.IRepo;
import com.tarea1.serv.ICrud;

public abstract class CrudImpl <T,ID> implements ICrud<T, ID>{

	protected abstract IRepo<T,ID> getRepo();
	
	@Override
	public T registrar(T obj) throws Exception {
		return getRepo().save(obj);
	}

	@Override
	public T modificar(T obj) throws Exception {
		return getRepo().save(obj);
	}

	@Override
	public List<T> listar() throws Exception {
		return getRepo().findAll();
	}
	
	@Override
	public T listarPorId(ID id) throws Exception {
		return getRepo().findById(id).orElse(null);		
	}
	
	@Override
	public void eliminar(ID id) throws Exception {
		getRepo().deleteById(id);
	}

}
