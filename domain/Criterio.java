package com.appturnos.app_turnos.domain;

public interface Criterio {
    boolean cumple(Cliente cliente, Reserva nuevaReserva);
}
