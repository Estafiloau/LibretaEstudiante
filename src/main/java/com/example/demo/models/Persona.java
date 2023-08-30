package com.example.demo.models;

public class Persona {
    //ATRIBUTOS.......................
    private Long IdPersona;
    private String nombre;
    private String apellido;
    private String DNI;
    private String telefono;
    private String mail;
    private String direccion;

    //GETTERS Y SETTERS..........................
    public void setIdPersona(Long idPersona) {
        IdPersona = idPersona;
    }

    public Long getIdPersona() {
        return IdPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

}

