package com.appturnos.app_turnos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.appturnos.app_turnos.domain.Cliente;
import com.appturnos.app_turnos.domain.EstadoCliente;
import com.appturnos.app_turnos.domain.EstadoProfesional;
import com.appturnos.app_turnos.domain.Profesional;
import com.appturnos.app_turnos.repository.ClienteRepository;
import com.appturnos.app_turnos.repository.ProfesionalRepository;

@SpringBootApplication
public class AppTurnosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppTurnosApplication.class, args);
	}
	@Bean
	CommandLineRunner initData(ClienteRepository clienteRepo,
                           ProfesionalRepository profRepo) {
    return args -> {
        clienteRepo.guardar(new Cliente(1L, "Juan", 123, EstadoCliente.ACTIVO));
        profRepo.guardar(new Profesional(1L, "Maria","Odontologia",EstadoProfesional.ACTIVO));
    };
	}


}

