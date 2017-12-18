package com.patrickDartora.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patrickDartora.cursomc.domain.Categoria;
import com.patrickDartora.cursomc.repositories.CategoriaRepository;
import com.patrickDartora.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Categoria obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! id: " + id + ", tipo: " + Categoria.class.getName());
		}
		
		return obj;
	}
}