package com.appturnos.app_turnos.domain;

public class Profesional {

    private Long id;
    private String nombre;
    private String especialidad;
    private EstadoProfesional estado;

    public Profesional(Long id, String nombre, String especialidad, EstadoProfesional estado) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public EstadoProfesional getEstado() {
        return estado;
    }
}
