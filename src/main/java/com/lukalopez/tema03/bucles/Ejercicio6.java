package com.lukalopez.tema03.bucles;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args[]) {
        int num=0;
        Scanner lector = new Scanner(System.in);
        while (num<1||num>10) {
            System.out.println("Introduzca un número del 1 al 10 y te devolveré su tabla de multiplicar: ");
            num = Integer.parseInt(lector.nextLine());
            if(num<1&&num>10){
                System.out.println("El número introducido no es valido.");
            }
        }
        lector.close();
        System.out.println("*** TABLA DEL "+num+" ***");
        for (int i=1;i<11;i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
