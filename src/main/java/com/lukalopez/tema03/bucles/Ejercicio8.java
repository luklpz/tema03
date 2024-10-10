package com.lukalopez.tema03.bucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String args[]) {
        int num = 0;
        int fac = 1;
        Scanner lector = new Scanner(System.in);
        while (num < 1) {
            System.out.println("Introduzca un número y devolveré su factorial:");
            num = Integer.parseInt(lector.nextLine());
            if (num < 0) {
                System.out.println("No es posible calcular el factorial de números negativos.");
            } else if (num == 0) {
                fac = 0;
            } else {
                for (int i = num; i != 0; i--) {
                    fac *= i;
                }
            }
        }
        System.out.println("El resultado del factorial es: "+fac);
    }
}
