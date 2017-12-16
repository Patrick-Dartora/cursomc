package com.patrickDartora.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrickDartora.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	
}
