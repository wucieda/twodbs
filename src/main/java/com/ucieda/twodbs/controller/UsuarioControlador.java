package com.ucieda.twodbs.controller;

import com.ucieda.twodbs.entity.db2.TuEntidadDB2;
import com.ucieda.twodbs.entity.mongo.UsuarioMongo;
import com.ucieda.twodbs.entity.oracle.TuEntidadOracle;
import com.ucieda.twodbs.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {

    @Autowired
    private MiServicio servicio;


    @PostMapping("/mongo")
    public UsuarioMongo guardarEnMongo(@RequestBody UsuarioMongo usuario) {
        return servicio.guardarMongo(usuario);
    }

    @PostMapping("/db2")
    public TuEntidadDB2 guardarEnDB2(@RequestBody TuEntidadDB2 usuario) {
        return servicio.guardarEnDB2(usuario);
    }

    @PostMapping("/oracle")
    public TuEntidadOracle guardarEnOracle(@RequestBody TuEntidadOracle usuario) {
        return servicio.guardarEnOracle(usuario);
    }
}

