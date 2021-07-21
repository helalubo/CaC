/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helalubo.mook.venta.infrastructure.repositories;

import com.helalubo.config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import com.helalubo.mook.venta.application.interfaces.IVentaRepository;
import com.helalubo.mook.venta.domain.venta;

/**
 *
 * @author Helalubo
 */
public class VentaRepository implements IVentaRepository {

    //// QUERYS
    public static final String SQL_SELECT = "SELECT id, idComprador, idProducto, metodoDePago fecha FROM venta;";

    public static final String SQL_INSERT = "INSERT INTO venta (idComprador, idProducto, metodoDePago, fecha) VALUES (?, ?, ?, ?);";

    public static final String SQL_DELETE = "delete from venta where id = ?;";

    public static final String SQL_UPDATE = "UPDATE venta SET idComprador=?, idProducto =?, idProducto =?,metodoDePago =?, fecha =? WHERE id =?;";

    public ArrayList<venta> findAll() {

        ArrayList<venta> ventas = new ArrayList<venta>();

        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                venta ventaAux = new venta();
                ventaAux.setId(rs.getInt("id"));
                ventaAux.setIdUsuario(rs.getInt("idComprador"));
                ventaAux.setIdProducto(rs.getInt("idProducto"));
                ventaAux.setmetodoDePago(rs.getString("metodoDePago"));
                ventaAux.setFecha(rs.getTimestamp("fecha"));

                ventas.add(ventaAux);
            }

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {

            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(cn);

        }

        return ventas;
    }

    public int save(venta venta) {

        Connection cn = null;
        PreparedStatement ps = null;

        int registros = 0;

        try {
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL_INSERT);

            ps.setInt(1, venta.getIdUsuario());
            ps.setInt(2, venta.getIdProducto());
            ps.setString(3, venta.getMetodoDePago());
            ps.setTimestamp(4, venta.getFecha());

            registros = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {

            Conexion.close(ps);
            Conexion.close(cn);

        }

        return registros;
    }

    public int update(venta venta) {
        Connection cn = null;
        PreparedStatement ps = null;

        int registros = 0;

        try {
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL_UPDATE);

            ps.setInt(1, venta.getIdUsuario());
            ps.setInt(2, venta.getIdProducto());
            ps.setString(3, venta.getMetodoDePago());
            ps.setTimestamp(4, venta.getFecha());

            ps.setInt(5, venta.getId());

            registros = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {

            Conexion.close(ps);
            Conexion.close(cn);

        }

        return registros;
    }

    public int delete(venta venta) {
        Connection cn = null;
        PreparedStatement ps = null;

        int registros = 0;

        try {
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL_DELETE);

            ps.setInt(1, venta.getId());

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
