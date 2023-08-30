package com.example.demo.models;

public class Carrera {
    //ATRIBUTOS

    private Long IdCarrera;
    private String nombre;

    //GETTERS Y SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setIdCarrera(Long idCarrera ){
        this.IdCarrera=idCarrera;
    }
    public Long getIdCarrera(){
        return IdCarrera;
    }

}
