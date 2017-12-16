package com.patrickDartora.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrickDartora.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
}
