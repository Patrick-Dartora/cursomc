package com.patrickDartora.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrickDartora.cursomc.domain.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
	
}
