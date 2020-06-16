package com.tarea1.serv.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea1.model.DetallesVenta;
import com.tarea1.repo.IRepoDetallesVenta;
import com.tarea1.serv.IServiceDetallesV;

@Service
public class ServiceDetallesV implements IServiceDetallesV{

	
	@Autowired
	private IRepoDetallesVenta repo;
	
	@Override
	public DetallesVenta registrar(DetallesVenta detalle) throws Exception {
		
		/*Para registrar detalles de la venta, como tal la venta ya debe existir*/
		
		return repo.save(detalle);
	}
	

}
