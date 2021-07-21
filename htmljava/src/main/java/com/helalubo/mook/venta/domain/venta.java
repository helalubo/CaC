package com.helalubo.mook.venta.domain;

import java.sql.Timestamp;

public class venta {

    private Integer id;
    private Integer idUsuario;
    private Integer idProducto;
    private String metodoDePago;
    private Timestamp fecha;

    public venta() {

    }

    public venta(Integer id, Integer idUsuario, Integer idProductos, Timestamp fecha, String metodoDePago) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idProducto = idProductos;
        this.fecha = fecha;
        this.metodoDePago = metodoDePago;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Timestamp getFecha() {
        return this.fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getMetodoDePago() {
        return this.metodoDePago;
    }

    public void setmetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

}
