package com.lukalopez.tema03.ANSI;

public class Ejercicio6 {
    public static void main(String args[]) {
        String cadena = "";
        for (int i=1;i<10;i++){
            cadena = cadena + i;
            System.out.printf("%1$9s%1s\n",cadena);
        }
    }
}