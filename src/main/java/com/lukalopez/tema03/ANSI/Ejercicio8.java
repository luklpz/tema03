package com.lukalopez.tema03.ANSI;

public class Ejercicio8 {
    public static void main(String args[]) {
        int b=0;
        //Para repetir dos veces
        for (int cont=0;cont!=2;cont++) {
            //Numero de veces que se crea la fila
            for (int fc = 0; fc < 8; fc++) {
                //Numero de columnas que se generan
                for (int bc = 0; bc < 8; bc++) {
                    System.out.print("\u001B["+b+";3"+fc+";4"+bc+"m "+b+";3"+fc+";4"+bc+" ");
                }
                System.out.print("\u001B[0m");
                System.out.println();
            }
            b=1;
        }

    }
}
