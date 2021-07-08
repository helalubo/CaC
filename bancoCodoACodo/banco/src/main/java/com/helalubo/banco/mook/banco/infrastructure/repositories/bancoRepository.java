
package com.helalubo.banco.mook.banco.infrastructure.repositories;

import com.helalubo.banco.mook.banco.domain.banco;
import org.springframework.data.jpa.repository.JpaRepository;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public interface bancoRepository extends JpaRepository<banco, Integer> {

    banco findByCodigo(Integer codigo);
}
