package com.appturnos.app_turnos.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appturnos.app_turnos.domain.Reserva;
import com.appturnos.app_turnos.dto.CrearReservaRequest;
import com.appturnos.app_turnos.service.ReservaService;


@RestController
@RequestMapping("/reservas")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @PostMapping
    public Reserva crearReserva(@RequestBody CrearReservaRequest request) {

        return reservaService.crearReserva(
                request.getIdCliente(),
                request.getIdProfesional(),
                request.getFecha(),
                request.getHora()
        );
    }
}
