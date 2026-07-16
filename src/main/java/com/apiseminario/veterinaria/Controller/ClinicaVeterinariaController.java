package com.apiseminario.veterinaria.Controller;

import com.apiseminario.veterinaria.Entity.ClinicaVeterinaria;
import com.apiseminario.veterinaria.Service.ClinicaVeterinariaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clinica")
@RequiredArgsConstructor
public class ClinicaVeterinariaController {

    private final ClinicaVeterinariaService clinicaService;


    @PutMapping("/{id}")
    public ResponseEntity<ClinicaVeterinaria> actualizarClinica(
            @PathVariable Long id,
            @RequestBody ClinicaVeterinaria clinica) {

        return ResponseEntity.ok(
                clinicaService.actualizarClinica(id, clinica)
        );
    }
}