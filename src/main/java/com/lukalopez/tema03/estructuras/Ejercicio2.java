package com.lukalopez.tema03.estructuras;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String args[]) {
    Scanner lector = new Scanner(System.in);
    System.out.println("A continuación introducirás dos números y te diré cual es mayor, o si son equivalentes.");
    System.out.println("Introduce el primer número:");
    Double numero1 = Double.parseDouble(lector.nextLine());
        System.out.println("Introduce el segundo número:");
    Double numero2 = Double.parseDouble(lector.nextLine());
    if (numero1==numero2) {
        System.out.println("Ambos números son equivalentes");
        }
    else if (numero1>numero2) {
        System.out.println("El número " + numero1 + " es mayor que el número " + numero2);
        }
    else {
            System.out.println("El número " + numero2 + " es mayor que el número " + numero1);
        }
    lector.close();
    }
}
