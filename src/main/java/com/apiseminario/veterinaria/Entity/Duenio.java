package com.apiseminario.veterinaria.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "duenios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Duenio {

    @ManyToOne
    @JoinColumn(name = "duenio_id")
    private Duenio duenio;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String apellido;

    @Column(nullable = false, unique = true)
    private Integer dni;

    @Column(nullable = false)
    private Long telefono;

    @Column(length = 100)
    private String direccion;
}