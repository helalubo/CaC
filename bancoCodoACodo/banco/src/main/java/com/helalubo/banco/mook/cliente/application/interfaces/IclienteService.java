package com.helalubo.banco.mook.cliente.application.interfaces;

import com.helalubo.banco.mook.cliente.domain.*;
import java.util.List;

/**
 *
 * @author Helalubo
 */

public interface IclienteService {

    List<cliente> Seleccionar();

    cliente insertar(cliente cliente);

    cliente update(cliente cliente);

    void delete(cliente cliente);

}
