package com.lukalopez.tema03.ANSI;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String args[]) {
        int h,m,s;
        System.out.println();
        System.out.println("En este programa vamos a escribir una hora. ");
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("Introduzca los segundos: ");
            s = Integer.parseInt(lector.nextLine());
            if (s>59||s<0) {
                System.out.println("Dato no válido.");
                System.out.println();
            }
        } while (s>59||s<0);
        do {
            System.out.println("Introduzca los minutos: ");
            m = Integer.parseInt(lector.nextLine());
            if (m>59||m<0) {
                System.out.println("Dato no válido.");
                System.out.println();
            }
        } while (m>59||m<0);
        do {
            System.out.println("Introduzca las horas: ");
            h = Integer.parseInt(lector.nextLine());
            if (h>23||h<0) {
                System.out.println("Dato no válido.");
                System.out.println();
            }
        } while (h>23||h<0);
        System.out.println();
        System.out.printf("%02x:%02x:%02x",h,m,s);
    }
}
