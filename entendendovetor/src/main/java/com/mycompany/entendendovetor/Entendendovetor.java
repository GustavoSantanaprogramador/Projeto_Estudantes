/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entendendovetor;


import java.util.Scanner;
public class Entendendovetor {

    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);  
     
     int n = 5;
     float v[] = new float[n];
     int i;
     
     
     for (i=0; i<n; i++){
       System.out.printf("Informe um valor: " + (i+1),"-", n );
       v[i] = ler.nextFloat();
     }
      for(i=0; i<n;i++){
          System.out.print(v[i]);
      }
    }
}
