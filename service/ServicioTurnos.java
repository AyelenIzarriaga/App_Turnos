package com.appturnos.app_turnos.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.appturnos.app_turnos.domain.Cliente;
import com.appturnos.app_turnos.domain.Criterio;
import com.appturnos.app_turnos.domain.CriterioEstadoCliente;
import com.appturnos.app_turnos.domain.CriterioFechaHoraDisponible;
import com.appturnos.app_turnos.domain.CriterioFechaNoPasada;
import com.appturnos.app_turnos.domain.EstadoReserva;
import com.appturnos.app_turnos.domain.Profesional;
import com.appturnos.app_turnos.domain.Reserva;

@Service
public class ServicioTurnos {

    public Reserva crearReserva(Cliente cliente,
                                Profesional profesional,
                                LocalDate fecha,
                                LocalTime hora) {

        Reserva nuevaReserva =
                new Reserva(profesional, fecha, hora, EstadoReserva.ACTIVA);

        List<Criterio> criterios = List.of(
                new CriterioEstadoCliente(),
                new CriterioFechaHoraDisponible(),
                new CriterioFechaNoPasada()
        );

        for (Criterio criterio : criterios) {
            if (!criterio.cumple(cliente, nuevaReserva)) {
                throw new RuntimeException("No se puede crear la reserva");
            }
        }

        cliente.getReservas().add(nuevaReserva);
        return nuevaReserva;
    }
}
