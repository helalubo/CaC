package com.helalubo.mook.usuario.application.interfaces;

import com.helalubo.mook.usuario.domain.usuario;
import java.util.ArrayList;

public interface IUsuarioRepository {

    public ArrayList<usuario> findAll();

    public int save(usuario usuario);

    public int update(usuario usuario);

    public int delete(usuario usuario);
}
