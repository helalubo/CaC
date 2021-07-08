
package com.helalubo.banco.mook.banco.application.services;

import java.util.List;

import com.helalubo.banco.mook.banco.application.interfaces.IBancoService;
import com.helalubo.banco.mook.banco.domain.banco;
import com.helalubo.banco.mook.banco.infrastructure.repositories.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bancoService implements IBancoService {

    @Autowired
    private bancoRepository repo;

    public bancoService() {

    }

    public List<banco> Seleccionar() {

        return repo.findAll();
    }

    public banco insertar(banco banco) {

        return repo.save(banco);

    }

    public banco update(banco banco) {

        return repo.save(banco);
    }

    public void delete(banco banco) {

        repo.deleteById(banco.getCodigo());
    }

    @Override
    public banco obtenerUno(int idBanco) {

        return repo.findByCodigo(idBanco);
    }

    public float depositar(float importe, banco banco) {

        float rta = 0;
        if (importe != 0 && banco != null) {
            rta = banco.getfondo() + importe;
            banco.setfondo(banco.getfondo() + importe);
        }

        return rta;

    }

}
