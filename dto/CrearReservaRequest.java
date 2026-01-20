package com.appturnos.app_turnos.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class CrearReservaRequest {

    private Long idCliente;
    private Long idProfesional;
    private LocalDate fecha;
    private LocalTime hora;

    public Long getIdCliente() {
        return idCliente;
    }

    public Long getIdProfesional() {
        return idProfesional;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }
}
