/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helalubo.mook.producto.infrastructure.repositories;

import com.helalubo.config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import com.helalubo.mook.producto.application.interfaces.IProductoRepository;
import com.helalubo.mook.producto.domain.producto;

/**
 *
 * @author User
 */
public class productoRepository implements IProductoRepository {

    //// QUERYS
    public static final String SQL_SELECT = "SELECT id, codigo, nombre, marca, tipo, pais, descripcion, precio  FROM producto;";

    public static final String SQL_SELECT_BY_ID = "SELECT id, codigo, nombre, marca, tipo, pais, descripcion, precio  FROM producto WHERE id =?;";

    public static final String SQL_INSERT = "INSERT INTO producto (codigo, nombre, marca, tipo, pais, descripcion, precio) VALUES (?, ?, ?, ?, ?, ?, ?);";

    public static final String SQL_DELETE = "delete from producto where id = ?;";

    public static final String SQL_UPDATE = "UPDATE producto SET codigo =?, nombre =?, marca =?, tipo =?, pais =?, descripcion =?, precio =? WHERE id =?;";

    public ArrayList<producto> findAll() {

        ArrayList<producto> productos = new ArrayList<producto>();

        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                producto productoAux = new producto();
                productoAux.setId(rs.getInt("id"));
                productoAux.setCodigo(rs.getInt("codigo"));
                productoAux.setNombre(rs.getString("nombre"));
                productoAux.setMarca(rs.getString("marca"));
                productoAux.setTipo(rs.getString("tipo"));
                productoAux.setPais(rs.getString("pais"));
                productoAux.setDescripcion(rs.getString("descripcion"));
                productoAux.setPrecio(rs.getFloat("precio"));

                productos.add(productoAux);
            }

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {

            try {
                Conexion.close(rs);
                Conexion.close(ps);
                Conexion.close(cn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return productos;
    }

    public int save(producto producto) {

        Connection cn = null;
        PreparedStatement ps = null;

        int registros = 0;

        try {
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL_INSERT);

            ps.setInt(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setString(3, producto.getMarca());
            ps.setString(4, producto.getTipo());
            ps.setString(5, producto.getPais());
            ps.setString(6, producto.getDescripcion());
            ps.setFloat(7, producto.getPrecio());

            registros = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {

            try {

                Conexion.close(ps);
                Conexion.close(cn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return registros;
    }

    public int update(producto producto) {
        Connection cn = null;
        PreparedStatement ps = null;

        int registros = 0;

        try {
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL_UPDATE);

            ps.setInt(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setString(3, producto.getMarca());
            ps.setString(4, producto.getTipo());
            ps.setString(5, producto.getPais());
            ps.setString(6, producto.getDescripcion());
            ps.setFloat(7, producto.getPrecio());
            ps.setInt(8, producto.getId());

            registros = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {

            try {

                Conexion.close(ps);
                Conexion.close(cn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return registros;
    }

    public int delete(producto producto) {
        Connection cn = null;
        PreparedStatement ps = null;

        int registros = 0;

        try {
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL_DELETE);

            ps.setInt(1, producto.getId());

            registros = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {

            try {

                Conexion.close(ps);
                Conexion.close(cn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return registros;
    }

}
