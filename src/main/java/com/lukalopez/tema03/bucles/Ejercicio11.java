package com.lukalopez.tema03.bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String args[]) {
        float num=0, med=0;
        int cont=-1;
        Scanner lector = new Scanner(System.in);
        do {
            med=med+num;
            cont=cont+1;
            System.out.println("Introduce números y haré su media (Introducir un número negativo detendrá el programa):");
            num =Float.parseFloat(lector.nextLine());
        }while (num>=0);
        lector.close();
        med=med/cont;
        System.out.println("La media de todos los números introducidos es: "+med);
    }
}
