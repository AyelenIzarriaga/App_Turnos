package com.appturnos.app_turnos.domain;

public class CriterioFechaHoraDisponible implements Criterio {

    @Override
    public boolean cumple(Cliente cliente, Reserva nuevaReserva) {

        for (Reserva r : cliente.getReservas()) {
            if (r.getEstado() == EstadoReserva.ACTIVA &&
                r.getFecha().equals(nuevaReserva.getFecha()) &&
                r.getHora().equals(nuevaReserva.getHora())) {

                return false;
            }
        }
        return true;
    }
}
