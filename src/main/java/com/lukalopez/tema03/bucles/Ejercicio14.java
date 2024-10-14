package com.lukalopez.tema03.bucles;

import java.util.Random;

public class Ejercicio14 {
    public static void main(String args[]) {
        System.out.println();
        System.out.println("Determinaremos la posibilidad de que salga cada número al tirar un dado:");
        System.out.println();
        int num, uno=0, dos=0, tres=0, cuatro=0, cinco=0, seis=0;
        Random rand = new Random();
        for (int i=1;i<1000000;i++) {
            num = rand.nextInt(6);
            if (num==0){
                uno+=1;
            }
            else if (num==1){
                dos+=1;
            }
            else if (num==2){
                tres+=1;
            }
            else if (num==3){
                cuatro+=1;
            }
            else if (num==4){
                cinco+=1;
            }
            else {
                seis+=1;
            }
        }
        System.out.println("El número 1 ha aparecido "+uno+" veces. Su porcentaje es del "+uno/10000+"%.");
        System.out.println("El número 2 ha aparecido "+dos+" veces. Su porcentaje es del "+dos/10000+"%.");
        System.out.println("El número 3 ha aparecido "+tres+" veces. Su porcentaje es del "+tres/10000+"%.");
        System.out.println("El número 4 ha aparecido "+cuatro+" veces. Su porcentaje es del "+cuatro/10000+"%.");
        System.out.println("El número 5 ha aparecido "+cinco+" veces. Su porcentaje es del "+cinco/10000+"%.");
        System.out.println("El número 6 ha aparecido "+seis+" veces. Su porcentaje es del "+seis/10000+"%.");
        System.out.println();
    }
}
