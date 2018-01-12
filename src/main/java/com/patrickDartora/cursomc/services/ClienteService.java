package com.patrickDartora.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patrickDartora.cursomc.domain.Cliente;
import com.patrickDartora.cursomc.repositories.ClienteRepository;
import com.patrickDartora.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		
		Cliente obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! id: " + id + ", tipo: " + Cliente.class.getName());
		}
		
		return obj;
	}
}
