package com.helalubo.mook.producto.application.services;

import java.util.List;

import com.helalubo.mook.producto.application.interfaces.*;
import com.helalubo.mook.producto.domain.*;
import com.helalubo.mook.producto.infrastructure.repositories.productoRepository;

public class productoService implements IProductoService {

    public productoRepository repo = new productoRepository();

    public List<producto> findAll() {

        return repo.findAll();
    }

    public int save(producto producto) {

        return repo.save(producto);

    }

    public int update(producto producto) {

        return repo.update(producto);
    }

    public int delete(producto producto) {

        return repo.delete(producto);
    }

}
