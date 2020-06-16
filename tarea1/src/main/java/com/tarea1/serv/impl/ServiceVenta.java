package com.tarea1.serv.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea1.model.Venta;
import com.tarea1.repo.IRepoVenta;
import com.tarea1.serv.IServicieVenta;

@Service
public class ServiceVenta implements IServicieVenta {
	
	@Autowired
	private IRepoVenta repo;

	@Override
	public Venta registrar(Venta venta) throws Exception {
		
		venta.getDetallesVenta().forEach(v -> v.setIdVenta(venta));
		
		
		return repo.save(venta);
	}
	
	

}
