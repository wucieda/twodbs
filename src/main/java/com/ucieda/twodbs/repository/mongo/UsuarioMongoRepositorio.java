package com.ucieda.twodbs.repository.mongo;

import com.ucieda.twodbs.entity.mongo.UsuarioMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioMongoRepositorio extends MongoRepository<UsuarioMongo, String> {
}
