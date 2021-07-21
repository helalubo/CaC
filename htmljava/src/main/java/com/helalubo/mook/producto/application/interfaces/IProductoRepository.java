package com.helalubo.mook.producto.application.interfaces;

import com.helalubo.mook.producto.domain.producto;
import java.util.ArrayList;

public interface IProductoRepository {

    public ArrayList<producto> findAll();

    public int save(producto producto);

    public int update(producto producto);

    public int delete(producto producto);
}
