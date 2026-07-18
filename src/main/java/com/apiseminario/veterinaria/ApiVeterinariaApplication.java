package com.apiseminario.veterinaria;

import com.apiseminario.veterinaria.Entity.ClinicaVeterinaria;
import com.apiseminario.veterinaria.Repository.ClinicaVeterinariaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiVeterinariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiVeterinariaApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ClinicaVeterinariaRepository repo) {
		return args -> {
			// Si la base de datos no tiene ninguna clínica, crea la única del sistema
			if (repo.count() == 0) {
				ClinicaVeterinaria unicaClinica = new ClinicaVeterinaria();
				unicaClinica.setNombre("Veterinaria Central");
				unicaClinica.setDireccion("Calle Falsa 123");
				unicaClinica.setTelefono(2231234567L);

				repo.save(unicaClinica);
				System.out.println("🌱 Clínica única inicializada automáticamente con ID 1");
			}
		};
	}
}