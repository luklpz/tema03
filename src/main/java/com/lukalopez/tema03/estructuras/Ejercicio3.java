package com.lukalopez.tema03.estructuras;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.println("A continuación introduce tu edad y comprobaré si eres mayor de edad:");
        int edad = Integer.parseInt(lector.nextLine());
        if (edad<18) {
            System.out.println("Eres menor de edad.");
            }
        else {
            System.out.println("Eres mayor de edad.");
        }
        lector.close();
    }

}
