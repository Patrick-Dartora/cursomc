package com.patrickDartora.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrickDartora.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
	
}
