package com.ejercicoTodoCode.veterinaria.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Dueno {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idDueno;
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;


    public Dueno() {
    }

    public Dueno(Long idDueno, String dni, String nombre, String apellido, String celular) {
        this.idDueno = idDueno;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
}

