package com.idat.clases;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Sumar {
     private int num1;
     private int num2;
     private int num3;

     public Integer getSuma() {
          return (num1 + num2 + num3);
     }

     public int[] getNumbers() {
          int[] arrlist = { num1, num2, num3 };
          return arrlist;
     }
}
