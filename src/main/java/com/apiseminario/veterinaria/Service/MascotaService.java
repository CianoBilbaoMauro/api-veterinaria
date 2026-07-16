package com.apiseminario.veterinaria.Service;

import com.apiseminario.veterinaria.Entity.Mascota;
import com.apiseminario.veterinaria.Repository.MascotaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MascotaService {

    private final MascotaRepository mascotaRepository;


    // Obtener todas las mascotas
    public List<Mascota> listarMascotas() {
        return mascotaRepository.findAll();
    }


    // Buscar mascota por ID
    public Mascota buscarMascota(Long id) {
        return mascotaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mascota no encontrada con id: " + id));
    }


    // Crear mascota
    public Mascota guardarMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }


    // Actualizar mascota
    public Mascota actualizarMascota(Long id, Mascota mascotaNueva) {

        Mascota mascota = buscarMascota(id);

        mascota.setNombre(mascotaNueva.getNombre());
        mascota.setEspecie(mascotaNueva.getEspecie());
        mascota.setRaza(mascotaNueva.getRaza());
        mascota.setEdad(mascotaNueva.getEdad());
        mascota.setPeso(mascotaNueva.getPeso());

        return mascotaRepository.save(mascota);
    }


    // Eliminar mascota
    public void eliminarMascota(Long id) {
        Mascota mascota = buscarMascota(id);
        mascotaRepository.delete(mascota);
    }
}