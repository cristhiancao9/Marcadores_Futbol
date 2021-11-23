package com.partidoback.partidos.services;

import java.util.List;

import com.partidoback.partidos.models.EquipoModel;
import com.partidoback.partidos.repositories.EquipoRepositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoService {
    @Autowired
    EquipoRepositorie equipoRepositorie;
    public void guardarEquipo(EquipoModel equipo){
        this.equipoRepositorie.save(equipo);
    }
    public List<EquipoModel> obtenerEquipos(){
        return this.equipoRepositorie.findAll();
    } 
}
