package com.lukalopez.tema03.estructuras;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una calificación del 1 al 10 y te diré su equivalente:");
        int calificacion = Integer.parseInt(lector.nextLine());
        if (-1<calificacion&&calificacion<5) {
            System.out.println("INSUFICIENTE");
        }
        else if (4<calificacion&&calificacion<6){
            System.out.println("SUFICIENTE");
        }
        else if (5<calificacion&&calificacion<7){
            System.out.println("BIEN");
        }
        else if (6<calificacion&&calificacion<9){
            System.out.println("NOTABLE");
        }
        else if (8<calificacion&&calificacion<11){
            System.out.println("SOBRESALIENTE");
        }
        else {
            System.out.println("ERROR");
        }
        lector.close();
    }
}
