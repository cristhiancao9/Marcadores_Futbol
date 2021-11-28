package com.partidoback.partidos.models;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="equipos")
public class EquipoModel {
  @Id  
  private String id;
  @NotEmpty(message="El nombre del equipo no puede estar vacio")
  private String nombres;
  
  public String getId(){
      return id;
  }
  public void setId(String id){
      this.id = id;
  }
  public String getNombres(){
      return nombres;
  }
  public void setNombres(String nombres){
    this.nombres = nombres;
}


}
