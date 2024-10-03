package com.lukalopez.tema03.estructuras;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.println("En este programa, a partir de los lados de un triángulo, indicaré de que tipo es. Primero, introduce el tamaño del primer lado: ");
        lado1 = Double.parseDouble(lector.nextLine());
        System.out.println("A continuación, introduce el tamaño del segundo lado: ");
        lado2 = Double.parseDouble(lector.nextLine());
        System.out.println("Por último, introduce el tamaño del último dado: ");
        lado3 = Double.parseDouble(lector.nextLine());
        lector.close();

        if ((lado1==lado2)&&(lado1==lado3)) {
            System.out.println("El triángulo es equilátero.");
        } else if ((lado1==lado2)||(lado2==lado3)||(lado1==lado3)) {
            System.out.println("El triángulo es isósceles.");
        }
        else {
            System.out.println("El triángulo es escaleno.");
        }
    }
}
