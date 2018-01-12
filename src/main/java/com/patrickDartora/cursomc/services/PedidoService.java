package com.patrickDartora.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patrickDartora.cursomc.domain.Pedido;
import com.patrickDartora.cursomc.repositories.PedidoRepository;
import com.patrickDartora.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		
		Pedido obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! id: " + id + ", tipo: " + Pedido.class.getName());
		}
		
		return obj;
	}
}
