package com.lukalopez.tema03.estructuras;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String args[]){
       Scanner lector = new Scanner(System.in);
       int dado;
       int ladoOpuesto = 1;
       System.out.println("Te mostraré el lado opuesto al obtenido tras lanzar un dado. Introduce a continuación el número obtenido en el dado:");
       dado = Integer.parseInt(lector.nextLine());
       switch (dado) {
           case 1:
               ladoOpuesto = 6;
               break;
           case 2:
               ladoOpuesto = 5;
               break;
           case 3:
               ladoOpuesto = 4;
               break;
           case 4:
               ladoOpuesto = 3;
               break;
           case 5:
               ladoOpuesto = 2;
               break;
           case 6:
               ladoOpuesto = 1;
               break;
           default:
               System.out.println("ERROR: Número no valido.");
       }
       System.out.println("El lado opuesto al obtenido en el dado es " + ladoOpuesto + ".");
       lector.close();
    }
}
