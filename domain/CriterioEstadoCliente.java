package com.appturnos.app_turnos.domain;

public class CriterioEstadoCliente implements Criterio {

    @Override
    public boolean cumple(Cliente cliente, Reserva nuevaReserva) {
        return cliente.getEstado() == EstadoCliente.ACTIVO;
    }
}
