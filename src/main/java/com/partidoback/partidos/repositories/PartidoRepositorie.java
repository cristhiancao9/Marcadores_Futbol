package com.partidoback.partidos.repositories;

import com.partidoback.partidos.models.PartidoModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidoRepositorie extends MongoRepository<PartidoModel, String>{
    
}
