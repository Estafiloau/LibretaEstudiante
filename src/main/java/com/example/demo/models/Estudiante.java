package com.example.demo.models;

public class Estudiante {
    //ATRIBUTOS
    private Long IdEstudiante;
    private Long IdPersona;
    private Integer legajo;

    //GETTERs y SETTERs
    public void setIdEstudiante(Long idEstudiante) {
        IdEstudiante = idEstudiante;
    }
    public Long getIdEstudiante(){
        return IdEstudiante;
    }
    public void setIdPersona(Long IdPersona){
        this.IdPersona=IdPersona;
    }
    public Long getIdPersona(){
        return IdPersona;
    }
    public void setLegajo(Integer legajo){
        this.legajo=legajo;
    }
    public Integer getLegajo(){
        return legajo;
    }

}

