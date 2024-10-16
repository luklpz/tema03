package com.lukalopez.tema03.ANSI;

public class Ejercicio7 {
    public static void main(String args[]) {
        String cadena = "";
        String cadena2 = "";
        for (int i = 1; i < 10; i++) {
            cadena = cadena + i;
            System.out.printf("%9s", cadena);

            cadena2= i+cadena2;
            System.out.printf("%s\n",cadena2);
        }
    }
}