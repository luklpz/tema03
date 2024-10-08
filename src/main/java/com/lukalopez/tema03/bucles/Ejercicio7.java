package com.lukalopez.tema03.bucles;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String args[]) {
        double a;
        double pot=1;
        int b;
        System.out.println("*** POTENCIA ***");
        Scanner lector = new Scanner(System.in);
        System.out.println("En este programa calcularemos la potencia de un número. Introduzca un número real como base:");
        a = Double.parseDouble(lector.nextLine());
        System.out.println("Introduzca un número entero como exponente:");
        b = Integer.parseInt(lector.nextLine());
        lector.close();
        if (b != 0) {
            for (int i = 1; i <= Math.abs(b); i++) {
                pot = pot*a;
            }
            if (b<0) {
                pot=1/pot;
            }
        }

        System.out.println(a+" elevado a "+b+"="+pot);
    }
}
