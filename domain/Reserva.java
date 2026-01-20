package com.appturnos.app_turnos.domain;

import java.time.LocalDate;
import java.time.LocalTime;


public class Reserva {

    private Long id;
    private Profesional profesional;
    private LocalDate fecha;
    private LocalTime hora;
    private EstadoReserva estado;

    public Reserva(Profesional profesional,
                   LocalDate fecha,
                   LocalTime hora,
                   EstadoReserva estado) {

        this.profesional = profesional;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public EstadoReserva getEstado() {
        return estado;
    }
}
