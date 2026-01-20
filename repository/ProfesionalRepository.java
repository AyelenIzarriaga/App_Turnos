package com.appturnos.app_turnos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.appturnos.app_turnos.domain.Profesional;



@Repository
public class ProfesionalRepository {

    private List<Profesional> profesionales = new ArrayList<>();



    public Profesional buscarPorId(Long id) {
        return profesionales.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Profesional no encontrado"));
    }

    public void guardar(Profesional profesional) {
        profesionales.add(profesional);
    }



 }
