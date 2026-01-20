package com.appturnos.app_turnos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.appturnos.app_turnos.domain.Reserva;

@Repository
public class ReservaRepository {

    private List<Reserva> reservas = new ArrayList<>();

    public void guardar(Reserva reserva) {
        reservas.add(reserva);
    }
}
