package com.appturnos.app_turnos.domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private Long id;
    private String nombre;
    private double dni;
    private EstadoCliente estado;
    private List<Reserva> reservas = new ArrayList<>();

    public Cliente(Long id, String nombre, double dni, EstadoCliente estado) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDni() {
        return dni;
    }

    public EstadoCliente getEstado() {
        return estado;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
