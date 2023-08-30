package com.example.demo.models;

public class Profesor {
    //ATRIBUTOS
    private Long IdProfesor;
    private Long IdPersona;

    //GETTERS Y SETTERS

    public void setIdProfesor(Long IdProfesor){
        this.IdProfesor=IdProfesor;
    }
    public Long getIdProfesor(){
        return IdProfesor;
    }
    public void setIdPersona(Long IdPersona){
        this.IdPersona=IdPersona;
    }
    public Long getIdPersona(){
        return IdPersona;
    }

}
