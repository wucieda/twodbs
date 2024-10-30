package com.ucieda.twodbs.service;

import com.ucieda.twodbs.entity.db2.TuEntidadDB2;
import com.ucieda.twodbs.entity.mongo.UsuarioMongo;
import com.ucieda.twodbs.entity.oracle.TuEntidadOracle;
import com.ucieda.twodbs.repository.db2.TuEntidadDB2Repositorio;
import com.ucieda.twodbs.repository.mongo.UsuarioMongoRepositorio;
import com.ucieda.twodbs.repository.oracle.TuEntidadOracleRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MiServicio {

    @Autowired
    private TuEntidadDB2Repositorio db2Repositorio;

    @Autowired
    private TuEntidadOracleRepositorio oracleRepositorio;

    @Autowired
    private UsuarioMongoRepositorio mongoRepositorio;

    public TuEntidadDB2 guardarEnDB2(TuEntidadDB2 entidad) {
        return db2Repositorio.save(entidad);
    }

    public TuEntidadOracle guardarEnOracle(TuEntidadOracle entidad) {
        return oracleRepositorio.save(entidad);
    }

    public UsuarioMongo guardarMongo(UsuarioMongo usuario) {
        return mongoRepositorio.save(usuario);
    }
}