package com.partidoback.partidos.repositories;

import com.partidoback.partidos.models.EquipoModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EquipoRepositorie extends MongoRepository<EquipoModel,String> {
    
}
