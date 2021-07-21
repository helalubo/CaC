package com.helalubo.mook.producto.application.interfaces;

import com.helalubo.mook.producto.domain.*;
import java.util.List;

/**
 *
 * @author Helalubo
 */

public interface IProductoService {

    producto findById(Integer id);

    List<producto> findAll();

    int save(producto producto);

    int update(producto producto);

    int delete(producto producto);

}
