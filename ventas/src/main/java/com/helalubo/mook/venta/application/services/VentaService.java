package com.helalubo.mook.venta.application.services;

import java.util.List;

import com.helalubo.mook.venta.application.interfaces.*;
import com.helalubo.mook.venta.domain.*;
import com.helalubo.mook.venta.infrastructure.repositories.VentaRepository;

public class VentaService implements IVentaService {

    public VentaRepository repo = new VentaRepository();

    public List<venta> findAll() {

        return repo.findAll();
    }

    public int save(venta venta) {

        return repo.save(venta);

    }

    public int update(venta venta) {

        return repo.update(venta);
    }

    public int delete(venta venta) {

        return repo.delete(venta);
    }

}
