package com.lukalopez.tema03.ANSI;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]) {
        float num;
        System.out.println();
        System.out.println("A continuación introduzca un número real y lo mostraré con dos decimales: ");
        Scanner lector = new Scanner(System.in);
        System.out.printf("%.2f",(num = Float.parseFloat(lector.nextLine())));
        lector.close();
    }
}
