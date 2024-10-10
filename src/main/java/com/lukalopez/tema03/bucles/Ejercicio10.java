package com.lukalopez.tema03.bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String args[]) {
        float num=0, suma=0;
        Scanner lector = new Scanner(System.in);
        do {
            suma=suma+num;
            System.out.println("Introduce números y haré su suma. Introducir 0 detendrá el programa):");
            num =Float.parseFloat(lector.nextLine());
        }while (num!=0);
        lector.close();
        System.out.println("La suma de todos los números introducidos es: "+suma);
    }
}
