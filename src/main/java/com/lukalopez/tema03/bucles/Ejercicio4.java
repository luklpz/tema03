package com.lukalopez.tema03.bucles;

public class Ejercicio4 {
    public static void main(String args[]) {
        int contador = 0;
        for (int i=1;i<100;i+=2){
            System.out.print(i + ", ");
            contador=contador + 1;
        }
        System.out.println(" ");
        System.out.println("Hay " + contador + " números impares del 1 y el 100.");
    }
}
