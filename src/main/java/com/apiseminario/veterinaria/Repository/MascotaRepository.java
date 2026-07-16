package com.apiseminario.veterinaria.Repository;

import com.apiseminario.veterinaria.Entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends JpaRepository < Mascota, Long> {

}