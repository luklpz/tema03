package com.lukalopez.tema03.estructuras;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.println("A continuación te pediré dos números y los escribiré  de mayor a menor:");
        System.out.println("Introduce el primer número: ");
        float numero1 = Float.parseFloat(lector.nextLine());
        System.out.println("Introduce el segundo número: ");
        float numero2 = Float.parseFloat(lector.nextLine());
        if (numero1>numero2) {
            System.out.println(numero1 + ", " + numero2);
        }
        else if (numero2>numero1){
            System.out.println(numero2 + ", " + numero1);
        }
        else {
            System.out.println("Ambos números son equivalentes.");
        }
        lector.close();
    }

}