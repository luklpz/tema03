package com.lukalopez.tema03.bucles;

public class Ejercicio5 {

    public static void main(String args[]) {
        float cImpar = 0;
        float sImpar = 0;
        float cPar = 1;
        float sPar = 100;
        for (int i=1;i<100;i++){
            System.out.print(i);
            if (i % 2 == 0) {
                System.out.print(" par");
                cPar=cPar+1;
                sPar=sPar+i;
            }
                else{
                System.out.print(" impar");
                cImpar = cImpar + 1;
                sImpar = sImpar + i;
            }
            if (i % 5 == 0) {
                System.out.print(" y múltiplo de 5,  ");
            }
            else{
                System.out.print(", ");

            }
        }
        System.out.println("100 par y múltiplo de 5.");
        System.out.println("Hay " + cPar + " pares, siendo su suma " +sPar+ "; hay " + cImpar+ " siendo su suma "+sImpar+".");

    }
}
