package com.helalubo.banco.mook.cliente.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Float cantidad;

    public cliente() {
    }

    public cliente(String nombre, float cantidad) {

        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getcantidad() {
        return this.cantidad;
    }

    public void setcantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public cliente id(int id) {
        setId(id);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", cantidad='" + getcantidad() + "'" + ", nombre='" + getNombre() + "'"
                + "}";
    }

}
