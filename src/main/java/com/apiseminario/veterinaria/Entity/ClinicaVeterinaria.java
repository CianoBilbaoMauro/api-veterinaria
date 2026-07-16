package com.apiseminario.veterinaria.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "clinica_veterinaria")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class ClinicaVeterinaria {

    @OneToMany(mappedBy = "clinicaVeterinaria")
    private List<Veterinario> veterinarios;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String direccion;

    @Column(nullable = false)
    private Long telefono;


}