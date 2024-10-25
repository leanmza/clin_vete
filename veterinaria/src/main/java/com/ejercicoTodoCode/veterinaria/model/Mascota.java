package com.ejercicoTodoCode.veterinaria.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idMascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;

    @OneToOne
    @JoinColumn(name = "idDueno", referencedColumnName = "idDueno")
    private Dueno dueno;

    public Mascota() {
    }

    public Mascota(Long idMascota, String nombre, String especie, String raza, String color, Dueno dueno) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.dueno = dueno;
    }
}
