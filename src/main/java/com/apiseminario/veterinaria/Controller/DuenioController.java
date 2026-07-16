package com.apiseminario.veterinaria.Controller;

import com.apiseminario.veterinaria.Entity.Duenio;
import com.apiseminario.veterinaria.Service.DuenioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/duenios")
@RequiredArgsConstructor

public class DuenioController {

    private final DuenioService duenioService;


    // Obtener todos los dueños
    @GetMapping
    public ResponseEntity<List<Duenio>> listarDuenios() {
        return ResponseEntity.ok(duenioService.listarDuenios());
    }


    // Buscar dueño por ID
    @GetMapping("/{id}")
    public ResponseEntity<Duenio> buscarDuenio(@PathVariable Long id) {
        return ResponseEntity.ok(duenioService.buscarDuenio(id));
    }


    // Crear dueño
    @PostMapping
    public ResponseEntity<Duenio> guardarDuenio(@RequestBody Duenio duenio) {
        return ResponseEntity.ok(duenioService.guardarDuenio(duenio));
    }


    // Actualizar dueño
    @PutMapping("/{id}")
    public ResponseEntity<Duenio> actualizarDuenio(
            @PathVariable Long id,
            @RequestBody Duenio duenio) {

        return ResponseEntity.ok(duenioService.actualizarDuenio(id, duenio));
    }


    // Eliminar dueño
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarDuenio(@PathVariable Long id) {

        duenioService.eliminarDuenio(id);

        return ResponseEntity.noContent().build();
    }
}