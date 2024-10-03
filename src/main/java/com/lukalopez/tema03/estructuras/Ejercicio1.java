package com.lukalopez.tema03.estructuras;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        System.out.println("A continuación introduce un número y te diré si es par o impar:");
        int numero = Integer.parseInt(lector.nextLine());
        if (numero % 2 == 0){
            System.out.println("El número introducido es par.");
        }
        else{
            System.out.println("El número introducido es impar.");
        }
        lector.close();
    }
}
