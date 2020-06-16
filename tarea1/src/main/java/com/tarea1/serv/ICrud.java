package com.tarea1.serv;

import java.util.List;

public interface ICrud<T,V> {
	T registrar(T obj) throws Exception;
	T modificar(T obj) throws Exception;
	List<T> listar() throws Exception;
	T listarPorId(V id) throws Exception;
	void eliminar(V id) throws Exception;

}
