package com.lukalopez.tema03.ANSI;
public class Ejercicio5 {
    public static void main(String args[]) {
        String cadena = "";
        for (int i = 1; i < 10; i++) {
            cadena = cadena + i;
            System.out.print("\u001B[3" + (i - 2) + "m");
            System.out.printf("%9s\n", cadena);
            System.out.print("\u001B[0m");
        }

    }
}