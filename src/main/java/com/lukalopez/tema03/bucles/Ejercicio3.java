package com.lukalopez.tema03.bucles;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String args[]) {
        float suma, numero1, numero2;
        Scanner lector = new Scanner(System.in);
        System.out.println("En este programa se devolverá el producto de la multiplicación de dos números. A continuación proporciona el primer número:");
        numero1 = Float.parseFloat(lector.nextLine());
        System.out.println("Introduce el segundo número: ");
        numero2 = Float.parseFloat(lector.nextLine());
        lector.close();
        suma=numero1;
        for (float i=1;i<numero2;i++){
            suma=suma+numero1;
        }
        System.out.println("El resultado de la multiplicación es: " + suma);
    }
}
