package com.idat.clases;

import lombok.AllArgsConstructor;

import lombok.Data;

//genera get and set
@Data
// genera constructor
@AllArgsConstructor()
public class Promedio {
     private Usuarios user;
     private int nota1;
     private int nota2;
     private int nota3;

     public Double getPromedio() {
          return Double.valueOf((nota1 + nota2 + nota3) / 3);
     }

     public int[] getNotas() {
          int[] arrlist = { nota1, nota2, nota3 };
          return arrlist;
     }

}
