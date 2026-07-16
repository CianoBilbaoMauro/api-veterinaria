package com.apiseminario.veterinaria.Controller;
import org.springframework.http.HttpStatus;
import com.apiseminario.veterinaria.Entity.Mascota;
import com.apiseminario.veterinaria.Service.MascotaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascotas")
@RequiredArgsConstructor
public class MascotaController {

    private final MascotaService mascotaService;


    // GET: listar todas las mascotas
    @GetMapping
    public ResponseEntity<List<Mascota>> listarMascotas() {
        return ResponseEntity.ok(mascotaService.listarMascotas());
    }


    // GET: buscar mascota por ID
    @GetMapping("/{id}")
    public ResponseEntity<Mascota> buscarMascota(@PathVariable Long id) {
        return ResponseEntity.ok(mascotaService.buscarMascota(id));
    }


    // POST: crear mascota
    @PostMapping
    public ResponseEntity<Mascota> guardarMascota(@RequestBody Mascota mascota) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(mascotaService.guardarMascota(mascota));
    }


    // PUT: actualizar mascota
    @PutMapping("/{id}")
    public ResponseEntity<Mascota> actualizarMascota(
            @PathVariable Long id,
            @RequestBody Mascota mascota) {

        return ResponseEntity.ok(mascotaService.actualizarMascota(id, mascota));
    }


    // DELETE: eliminar mascota
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMascota(@PathVariable Long id) {

        mascotaService.eliminarMascota(id);

        return ResponseEntity.noContent().build();
    }
}