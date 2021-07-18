package com.helalubo.mook.venta.application.interfaces;

import com.helalubo.mook.venta.domain.*;
import java.util.List;

/**
 *
 * @author Helalubo
 */

public interface IVentaService {

    List<venta> findAll();

    int save(venta persona);

    int update(venta persona);

    int delete(venta persona);

}
