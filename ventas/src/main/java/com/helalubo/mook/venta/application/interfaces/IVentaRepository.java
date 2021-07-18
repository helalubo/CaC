package com.helalubo.mook.venta.application.interfaces;

import com.helalubo.mook.venta.domain.venta;
import java.util.ArrayList;

public interface IVentaRepository {

    public ArrayList<venta> findAll();

    public int save(venta venta);

    public int update(venta venta);

    public int delete(venta venta);
}
