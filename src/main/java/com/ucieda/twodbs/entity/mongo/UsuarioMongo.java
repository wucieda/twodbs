package com.ucieda.twodbs.entity.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class UsuarioMongo {
    @Id
    private String id;
    private String nombre;

    // Getters y setters
}
