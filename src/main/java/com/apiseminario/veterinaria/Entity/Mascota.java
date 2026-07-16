package com.apiseminario.veterinaria.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "mascotas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor



public class Mascota {

    @ManyToOne(optional = false)
    @JoinColumn(name = "duenio_id", nullable = false)
    private Duenio duenio;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 30)
    private String especie;

    @Column(nullable = false, length = 40)
    private String raza;

    @Column(nullable = false)
    private Integer edad;

    @Column(nullable = false)
    private BigDecimal peso;

}

