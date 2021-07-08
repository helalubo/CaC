package com.helalubo.banco.mook.banco.application.interfaces;

import com.helalubo.banco.mook.banco.domain.*;
import java.util.List;

/**
 *
 * @author Helalubo
 */

public interface IBancoService {

    List<banco> Seleccionar();

    banco insertar(banco producto);

    banco update(banco producto);

    void delete(banco producto);

    banco obtenerUno(int idBanco);

}
