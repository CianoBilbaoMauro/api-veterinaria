package com.apiseminario.veterinaria.Service;

import com.apiseminario.veterinaria.Entity.Duenio;
import com.apiseminario.veterinaria.Repository.DuenioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor


public class DuenioService {

    private final DuenioRepository duenioRepository;


    // Listar todos los dueños
    public List<Duenio> listarDuenios() {
        return duenioRepository.findAll();
    }


    // Buscar dueño por ID
    public Duenio buscarDuenio(Long id) {
        return duenioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Dueño no encontrado con id: " + id));
    }


    // Crear dueño
    public Duenio guardarDuenio(Duenio duenio) {
        return duenioRepository.save(duenio);
    }


    // Actualizar dueño
    public Duenio actualizarDuenio(Long id, Duenio duenioNuevo) {

        Duenio duenio = buscarDuenio(id);

        duenio.setNombre(duenioNuevo.getNombre());
        duenio.setApellido(duenioNuevo.getApellido());
        duenio.setDni(duenioNuevo.getDni());
        duenio.setTelefono(duenioNuevo.getTelefono());
        duenio.setDireccion(duenioNuevo.getDireccion());

        return duenioRepository.save(duenio);
    }


    // Eliminar dueño
    public void eliminarDuenio(Long id) {

        Duenio duenio = buscarDuenio(id);
        duenioRepository.delete(duenio);

    }
}