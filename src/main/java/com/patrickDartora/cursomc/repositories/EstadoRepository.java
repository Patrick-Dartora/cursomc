package com.patrickDartora.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrickDartora.cursomc.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	
}
