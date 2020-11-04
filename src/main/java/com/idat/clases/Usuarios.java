package com.idat.clases;

import lombok.Data;

@Data
public class Usuarios {
     private long id;
     private String nombreusuario;
     private String nombrecompleto;

     public Usuarios(long id, String nombreusuario, String nombrecompleto) {
          this.id = id;
          this.nombreusuario = nombreusuario;
          this.nombrecompleto = nombrecompleto;
     }
}
