package com.partidoback.partidos.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.partidoback.partidos.exceptions.CustomException;
import com.partidoback.partidos.models.EquipoModel;
import com.partidoback.partidos.services.EquipoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EquipoController {
    @Autowired
    EquipoService equipoService;
    @PostMapping("/equipos")
    public ResponseEntity<Map<String, String>> guardar(@Valid @RequestBody EquipoModel equipo, Errors error){
        if(error.hasErrors()){
            throwError(error);
        }
        this.equipoService.guardarEquipo(equipo);
        Map<String, String> respuesta=new HashMap<>();
        respuesta.put("mensaje", "Se agrego el equipo correctamente");
        return ResponseEntity.ok(respuesta);
    }
    @GetMapping("/equipos")
    public List<EquipoModel> mostrar(){
       return this.equipoService.obtenerEquipos();
    }
        //Método para el manejo de errores
        public void throwError(Errors error){
            String mensaje="";
            int index=0;
            for(ObjectError e: error.getAllErrors()){
                if(index>0){
                    mensaje +=" | ";
                }
                mensaje+=String.format("Parametro: %s - Mensaje: %s", e.getObjectName(),e.getDefaultMessage());
            }
            throw new CustomException(mensaje);
        }
}
