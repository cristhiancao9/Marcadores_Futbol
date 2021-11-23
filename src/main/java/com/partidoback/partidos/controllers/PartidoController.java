package com.partidoback.partidos.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;


import com.partidoback.partidos.models.PartidoModel;
import com.partidoback.partidos.services.PartidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PartidoController {
    
    @Autowired
    PartidoService service;


    @PostMapping("/partidos") //Método HTTP -------> POST
    public ResponseEntity<Map<String, String>> guardar(@Valid @RequestBody PartidoModel partido, Errors error){
        //Verificamos si existe un error
 
        //Recibimos los datos por el body de la petición
        this.service.guardaPartido(partido); //Invocamos el metodo creado en el servicio
        Map<String, String> respuesta=new HashMap<>();//Creamos el map para la respuesta al cliente
        respuesta.put("mensaje", "Se agregó el partido correctamente"); //Se agrega la respuesta que se quiere enviar
        respuesta.put("estado", "true");
        return ResponseEntity.ok(respuesta); //Y se retorna esa respuesta
    }

  

    @PutMapping("/partidos") // Método HTTP ----> PUT
    public ResponseEntity<Map<String, String>> actualizar(@Valid @RequestBody PartidoModel partido){
        //Recibimos los datos por el body de la petición
        this.service.guardaPartido(partido); //Invocamos el metodo creado en el servicio
        Map<String, String> respuesta=new HashMap<>();//Creamos el map para la respuesta al cliente
        respuesta.put("mensaje", "Se actualizó el partido correctamente"); //Se agrega la respuesta que se quiere enviar
        respuesta.put("estado", "true");
        return ResponseEntity.ok(respuesta); //Y se retorna esa respuesta
    }


}