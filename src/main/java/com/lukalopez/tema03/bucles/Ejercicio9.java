package com.lukalopez.tema03.bucles;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String args[]) {
        int num;
        boolean primo = false;
        System.out.println("A continuación introduce un número entero y te diré si es primo: ");
        Scanner lector = new Scanner(System.in);
        num = Integer.parseInt(lector.nextLine());
        lector.close();
        for (int i = 2; i > (num / 2); i++) {
            if (num % i == 0) {
                primo = true;
                i = (num / 2) + 1;
            }
        }
        if (primo=true){
            System.out.println("El número "+ num + " no es un número primo.");
        }
        else {
            System.out.println("El número "+ num + " es un número primo.");
        }
    }
}