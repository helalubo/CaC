package com.helalubo.mook.usuario.domain;

public class usuario {

    private Integer id;
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private Integer telefono;
    private String correo;
    private String clave;

    public usuario() {
    }

    public usuario(int id, String dni, String nombre, String correo, String clave, String apellido, String direccion,
            Integer telefono) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.clave = clave;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Integer getTelefono() {
        return this.telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public usuario id(int id) {
        setId(id);
        return this;
    }

    public usuario dni(String dni) {
        setDni(dni);
        return this;
    }

    public usuario nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", dni='" + getDni() + "'" + ", nombre='" + getNombre() + "'" + "}";
    }

}
