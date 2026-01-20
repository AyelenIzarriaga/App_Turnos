package com.appturnos.app_turnos.service;

import com.appturnos.app_turnos.domain.Cliente;
import com.appturnos.app_turnos.domain.Profesional;
import com.appturnos.app_turnos.domain.Reserva;
import com.appturnos.app_turnos.domain.EstadoReserva;

import com.appturnos.app_turnos.repository.ClienteRepository;
import com.appturnos.app_turnos.repository.ProfesionalRepository;
import com.appturnos.app_turnos.repository.ReservaRepository;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class ReservaService {

    private final ClienteRepository clienteRepository;
    private final ProfesionalRepository profesionalRepository;
    private final ReservaRepository reservaRepository;
    private final ServicioTurnos servicioTurnos;

    public ReservaService(ClienteRepository clienteRepository,
                          ProfesionalRepository profesionalRepository,
                          ReservaRepository reservaRepository,
                          ServicioTurnos servicioTurnos) {

        this.clienteRepository = clienteRepository;
        this.profesionalRepository = profesionalRepository;
        this.reservaRepository = reservaRepository;
        this.servicioTurnos = servicioTurnos;
    }

    public Reserva crearReserva(Long idCliente,
                                Long idProfesional,
                                LocalDate fecha,
                                LocalTime hora) {

        Cliente cliente = clienteRepository.buscarPorId(idCliente);
        Profesional profesional = profesionalRepository.buscarPorId(idProfesional);

        Reserva reserva =
                servicioTurnos.crearReserva(cliente, profesional, fecha, hora);

        reservaRepository.guardar(reserva);
        return reserva;
    }
}
