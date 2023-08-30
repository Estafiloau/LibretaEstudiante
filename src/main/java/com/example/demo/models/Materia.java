package com.example.demo.models;

public class Materia {
    //ATRIBUTOS.........................
    private Long IdMateria;
    private String nombre;
    private Integer anio;
    private Long IdCarrera;
    private Long IdProfesor;
    private Long IdAyudante;

    //GETTERs y SETTERs..............................

    public void setIdMateria(Long idMateria) {
        IdMateria = idMateria;
    }

    public Long getIdMateria() {
        return IdMateria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public void setIdCarrera(Long idCarrera) {
        IdCarrera = idCarrera;
    }

    public Long getIdCarrera() {
        return IdCarrera;
    }

    public void setIdProfesor(Long idProfesor) {
        IdProfesor = idProfesor;
    }

    public Long getIdProfesor() {
        return IdProfesor;
    }

    public void setIdAyudante(Long idAyudante) {
        IdAyudante = idAyudante;
    }

    public Long getIdAyudante() {
        return IdAyudante;
    }
}
