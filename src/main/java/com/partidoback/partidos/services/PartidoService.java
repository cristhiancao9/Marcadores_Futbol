package com.partidoback.partidos.services;

import java.util.List;

import com.partidoback.partidos.models.PartidoModel;
import com.partidoback.partidos.repositories.PartidoRepositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PartidoService {
    @Autowired
    PartidoRepositorie partidoRepositorie;

    public void guardaPartido(PartidoModel partido){
        this.partidoRepositorie.save(partido);
    }
    public List<PartidoModel> traerTodos(){
        return this.partidoRepositorie.findAll();
    }
}
