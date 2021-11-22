package com.partidoback.partidos.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="equipos")
public class EquipoModel {
  private String id;
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
