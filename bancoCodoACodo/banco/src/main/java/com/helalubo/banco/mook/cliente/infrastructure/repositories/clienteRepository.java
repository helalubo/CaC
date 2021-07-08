package com.helalubo.banco.mook.cliente.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.helalubo.banco.mook.cliente.domain.cliente;

public interface clienteRepository extends JpaRepository<cliente, Integer> {
}
