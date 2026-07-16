package com.apiseminario.veterinaria.Service;

import com.apiseminario.veterinaria.Entity.Veterinario;
import com.apiseminario.veterinaria.Repository.VeterinarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VeterinarioService {

    private final VeterinarioRepository veterinarioRepository;


    public List<Veterinario> listarVeterinarios() {
        return veterinarioRepository.findAll();
    }


    public Veterinario buscarVeterinario(Long id) {
        return veterinarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Veterinario no encontrado con id: " + id));
    }


    public Veterinario guardarVeterinario(Veterinario veterinario) {
        return veterinarioRepository.save(veterinario);
    }


    public Veterinario actualizarVeterinario(Long id, Veterinario veterinarioNuevo) {

        Veterinario veterinario = buscarVeterinario(id);

        veterinario.setNombre(veterinarioNuevo.getNombre());
        veterinario.setApellido(veterinarioNuevo.getApellido());
        veterinario.setEspecialidad(veterinarioNuevo.getEspecialidad());
        veterinario.setMatricula(veterinarioNuevo.getMatricula());

        return veterinarioRepository.save(veterinario);
    }


    public void eliminarVeterinario(Long id) {

        Veterinario veterinario = buscarVeterinario(id);
        veterinarioRepository.delete(veterinario);

    }
}