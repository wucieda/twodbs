package com.ucieda.twodbs.entity.oracle;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TuEntidadOracle {
    @Id
    private Long id;
    private String descripcion;

    // Getters y setters
}
