/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helalubo.mook.usuario.infrastructure.repositories;

import com.helalubo.config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import com.helalubo.mook.usuario.application.interfaces.IUsuarioRepository;
import com.helalubo.mook.usuario.domain.usuario;

/**
 *
 * @author Helalubo
 */
public class usuarioRepository implements IUsuarioRepository {

    //// QUERYS
    public static final String SQL_SELECT = "SELECT id, dni, nombre, apellido, direccion, telefono, correo, clave  FROM usuario;";

    public static final String SQL_INSERT = "INSERT INTO usuario (dni, nombre, apellido, direccion, telefono, correo, clave) VALUES (?, ?, ?, ?, ?, ?, ?);";

    public static final String SQL_DELETE = "delete from usuario where id = ?;";

    public static final String SQL_UPDATE = "UPDATE usuario SET dni=? nombre =?, apellido =?, direccion =?, telefono =?, correo =?, clave =? WHERE id =?;";

    public ArrayList<usuario> findAll() {

        ArrayList<usuario> usuarios = new ArrayList<usuario>();

        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                usuario usuarioAux = new usuario();
                usuarioAux.setId(rs.getInt("id"));
                usuarioAux.setDni(rs.getString("dni"));
                usuarioAux.setNombre(rs.getString("nombre"));
                usuarioAux.setApellido(rs.getString("apellido"));
                usuarioAux.setDireccion(rs.getString("direccion"));
                usuarioAux.setTelefono(rs.getInt("telefono"));
                usuarioAux.setCorreo(rs.getString("correo"));
                usuarioAux.setClave(rs.getString("clave"));

                usuarios.add(usuarioAux);
            }

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {

            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(cn);

        }

        return usuarios;
    }

    public int save(usuario usuario) {

        Connection cn = null;
        PreparedStatement ps = null;

        int registros = 0;

        try {
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL_INSERT);

            ps.setString(1, usuario.getDni());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getApellido());
            ps.setString(4, usuario.getDireccion());
            ps.setInt(5, usuario.getTelefono());
            ps.setString(6, usuario.getCorreo());
            ps.setString(7, usuario.getClave());

            registros = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {

            Conexion.close(ps);
            Conexion.close(cn);

        }

        return registros;
    }

    public int update(usuario usuario) {
        Connection cn = null;
        PreparedStatement ps = null;

        int registros = 0;

        try {
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL_UPDATE);

            ps.setString(1, usuario.getDni());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getApellido());
            ps.setString(4, usuario.getDireccion());
            ps.setInt(5, usuario.getTelefono());
            ps.setString(6, usuario.getCorreo());
            ps.setString(7, usuario.getClave());
            ps.setInt(8, usuario.getId());

            registros = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {

            Conexion.close(ps);
            Conexion.close(cn);

        }

        return registros;
    }

    public int delete(usuario usuario) {
        Connection cn = null;
        PreparedStatement ps = null;

        int registros = 0;

        try {
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL_DELETE);

            ps.setInt(1, usuario.getId());

            registros = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {

            Conexion.close(ps);
            Conexion.close(cn);

        }

        return registros;
    }

}
