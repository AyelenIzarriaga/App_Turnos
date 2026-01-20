package com.appturnos.app_turnos.domain;

import java.time.LocalDateTime;

public class CriterioFechaNoPasada implements Criterio {

    @Override
    public boolean cumple(Cliente cliente, Reserva nuevaReserva) {

        LocalDateTime fechaHora =
                LocalDateTime.of(nuevaReserva.getFecha(), nuevaReserva.getHora());

        return fechaHora.isAfter(LocalDateTime.now());
    }
}
