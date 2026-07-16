package com.apiseminario.veterinaria.Repository;

import com.apiseminario.veterinaria.Entity.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DuenioRepository extends JpaRepository < Duenio, Long> {

}