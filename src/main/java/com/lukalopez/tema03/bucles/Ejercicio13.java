package com.lukalopez.tema03.bucles;

import java.util.Random;

public class Ejercicio13 {
    public static void main(String args[]) {
        System.out.println();
        System.out.println("Determinaremos la posibilidad de que salga cara o cruz al tirar una moneda:");
        int num, cara=0, cruz=0;
        Random rand = new Random();
        for (int i=1;i<1000000;i++) {
            num = rand.nextInt(2);
            if (num==0){
                cara+=1;
            }
            else {
                cruz+=1;
            }
        }
        System.out.print("El porcentaje de caras es "+(cara/10000)+"%.");
        System.out.print("EL porcentaje de cruces es "+(cruz/10000)+"%.");
        System.out.println();
    }
}
