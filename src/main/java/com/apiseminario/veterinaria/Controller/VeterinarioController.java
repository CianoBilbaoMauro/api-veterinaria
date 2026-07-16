package com.apiseminario.veterinaria.Controller;

import com.apiseminario.veterinaria.Entity.Veterinario;
import com.apiseminario.veterinaria.Service.VeterinarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veterinarios")
@RequiredArgsConstructor


public class VeterinarioController {

    private final VeterinarioService veterinarioService;


    // Obtener todos los veterinarios
    @GetMapping
    public ResponseEntity<List<Veterinario>> listarVeterinarios() {
        return ResponseEntity.ok(veterinarioService.listarVeterinarios());
    }


    // Buscar veterinario por ID
    @GetMapping("/{id}")
    public ResponseEntity<Veterinario> buscarVeterinario(@PathVariable Long id) {
        return ResponseEntity.ok(veterinarioService.buscarVeterinario(id));
    }


    // Crear veterinario
    @PostMapping
    public ResponseEntity<Veterinario> guardarVeterinario(
            @RequestBody Veterinario veterinario) {

        return ResponseEntity.ok(veterinarioService.guardarVeterinario(veterinario));
    }


    // Actualizar veterinario
    @PutMapping("/{id}")
    public ResponseEntity<Veterinario> actualizarVeterinario(
            @PathVariable Long id,
            @RequestBody Veterinario veterinario) {

        return ResponseEntity.ok(
                veterinarioService.actualizarVeterinario(id, veterinario)
        );
    }


    // Eliminar veterinario
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarVeterinario(@PathVariable Long id) {

        veterinarioService.eliminarVeterinario(id);

        return ResponseEntity.noContent().build();
    }
}
