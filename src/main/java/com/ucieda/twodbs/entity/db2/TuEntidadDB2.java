package com.ucieda.twodbs.entity.db2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TuEntidadDB2 {
    @Id
    private Long id;
    private String nombre;

    // Getters y setters
}