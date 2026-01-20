package com.appturnos.app_turnos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.appturnos.app_turnos.domain.Cliente;


@Repository
public class ClienteRepository {

    private List<Cliente> clientes = new ArrayList<>();

    public Cliente buscarPorId(Long id) {
        return clientes.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }

    public void guardar(Cliente cliente) {
        clientes.add(cliente);
    }
 
}
