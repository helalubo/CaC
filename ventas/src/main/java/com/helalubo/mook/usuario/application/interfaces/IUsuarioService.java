package com.helalubo.mook.usuario.application.interfaces;

import com.helalubo.mook.usuario.domain.*;
import java.util.List;

/**
 *
 * @author Helalubo
 */

public interface IUsuarioService {

    List<usuario> findAll();

    int save(usuario usuario);

    int update(usuario usuario);

    int delete(usuario usuario);

}
