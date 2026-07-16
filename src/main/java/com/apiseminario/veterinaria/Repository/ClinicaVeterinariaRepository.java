package com.apiseminario.veterinaria.Repository;

import com.apiseminario.veterinaria.Entity.ClinicaVeterinaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicaVeterinariaRepository extends JpaRepository<ClinicaVeterinaria, Long> {

}