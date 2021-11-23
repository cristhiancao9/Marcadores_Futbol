package com.partidoback.partidos.repositories;
import java.util.Optional;

import com.partidoback.partidos.models.UsuarioModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UsuarioRepositorie extends MongoRepository<UsuarioModel,String>{
    
    //Para buscar a un usuario por nombre de usuario (username)
    public Optional<UsuarioModel> findByUsername(String username);

    

}
