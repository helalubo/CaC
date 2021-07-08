package com.helalubo.banco.mook.cliente.application.services;

import java.util.List;

import com.helalubo.banco.mook.cliente.application.interfaces.*;
import com.helalubo.banco.mook.cliente.domain.cliente;
import com.helalubo.banco.mook.cliente.infrastructure.repositories.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class clienteService implements IclienteService {

    @Autowired
    public clienteRepository repo;

    public List<cliente> Seleccionar() {
        System.out.println("entra seleccionar");

        return repo.findAll();
    }

    public cliente insertar(cliente cliente) {

        return repo.save(cliente);

    }

    public cliente update(cliente cliente) {

        return repo.save(cliente);
    }

    public void delete(cliente cliente) {

        repo.deleteById(cliente.getId());
    }

}
