package com.lukalopez.tema03.ANSI;

public class Ejercicio8 {
    public static void main(String args[]) {
        int b=0;
        for (int cont=0;cont!=2;cont++) {
            for (int fc = 0; fc < 8; fc++) {
                for (int bc = 0; bc < 8; bc++) {
                    String cuadrante="\u001B["+b+";"+fc+";"+bc+"m";
                    System.out.print(cuadrante);
                    System.out.print(" "+b+";3"+fc+";4"+bc+" ");
                }
                System.out.println();
            }
            b=1;
        }
        System.out.print("\u001B[0m");
    }
}
