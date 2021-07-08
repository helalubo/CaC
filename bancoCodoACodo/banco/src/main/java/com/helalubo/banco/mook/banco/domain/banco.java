package com.helalubo.banco.mook.banco.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bancos")
public class banco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    private String nombre;
    private float fondo;

    public banco() {
    }

    public banco(int codigo, String nombre, float fondo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fondo = fondo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getnombre() {
        return this.nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public float getfondo() {
        return this.fondo;
    }

    public void setfondo(float fondo) {
        this.fondo = fondo;
    }

    @Override
    public String toString() {
        return "{" + " codigo='" + getCodigo() + "'" + ", nombre='" + getnombre() + "'" + ", fondo='" + getfondo() + "'"
                + "}";
    }

}
