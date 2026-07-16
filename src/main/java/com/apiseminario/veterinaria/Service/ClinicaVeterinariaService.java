package com.apiseminario.veterinaria.Service;

import com.apiseminario.veterinaria.Entity.ClinicaVeterinaria;
import com.apiseminario.veterinaria.Repository.ClinicaVeterinariaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClinicaVeterinariaService {

    private final ClinicaVeterinariaRepository clinicaVeterinariaRepository;


    public ClinicaVeterinaria actualizarClinica(Long id, ClinicaVeterinaria datosNuevos) {

        ClinicaVeterinaria clinica = clinicaVeterinariaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Clínica no encontrada"));

        clinica.setNombre(datosNuevos.getNombre());
        clinica.setDireccion(datosNuevos.getDireccion());
        clinica.setTelefono(datosNuevos.getTelefono());

        return clinicaVeterinariaRepository.save(clinica);
    }
}