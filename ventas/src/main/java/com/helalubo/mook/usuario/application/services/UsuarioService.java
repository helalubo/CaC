package com.helalubo.mook.usuario.application.services;

import java.util.List;

import com.helalubo.mook.usuario.application.interfaces.*;
import com.helalubo.mook.usuario.domain.*;
import com.helalubo.mook.usuario.infrastructure.repositories.usuarioRepository;

public class UsuarioService implements IUsuarioService {

    public usuarioRepository repo = new usuarioRepository();

    public List<usuario> findAll() {

        return repo.findAll();
    }

    public int save(usuario usuario) {

        return repo.save(usuario);

    }

    public int update(usuario usuario) {

        return repo.update(usuario);
    }

    public int delete(usuario usuario) {

        return repo.delete(usuario);
    }

}
