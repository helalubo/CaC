package com.helalubo.mook.producto.domain;

public class producto {

    private Integer id;
    private Integer codigo;
    private String nombre;
    private String marca;
    private String tipo;
    private String pais;
    private String descripcion;
    private float precio;

    public producto() {
    }

    public producto(Integer codigo, String nombre, String marca, String tipo, String pais, String descripcion,
            float precio) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.pais = pais;
        this.descripcion = descripcion;
        this.precio = precio;

    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", codigo='" + getCodigo() + "'" + ", nombre='" + getNombre() + "'"
                + ", marca='" + getMarca() + "'" + ", tipo='" + getTipo() + "'" + ", pais='" + getPais() + "'"
                + ", descripcion='" + getDescripcion() + "'" + ", precio='" + getPrecio() + "'" + "}";
    }

}
