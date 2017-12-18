package com.patrickDartora.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrickDartora.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
	
}
