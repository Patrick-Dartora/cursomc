package com.patrickDartora.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrickDartora.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
	
}
