package com.lukalopez.tema03.estructuras;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String args[]){
        int anyo;
        Scanner lector = new Scanner(System.in);
        System.out.println("En este programa calcularé si un año es bisiesto. Por favor, introduce el año a comprobar:");
        anyo = Integer.parseInt(lector.nextLine());
        if (((anyo % 4 == 0)&&(anyo % 100!=0))||(anyo % 400 == 0)) {
            System.out.println("El año es bisiesto.");
        }
        else {
            System.out.println("El año no es bisiesto.");
        }
        lector.close();
    }
}
