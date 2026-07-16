package com.apiseminario.veterinaria.Repository;

import com.apiseminario.veterinaria.Entity.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinarioRepository extends JpaRepository < Veterinario, Long> {

}