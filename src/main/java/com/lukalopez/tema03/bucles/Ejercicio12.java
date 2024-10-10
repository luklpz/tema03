package com.lukalopez.tema03.bucles;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String args[]) {
        int num = (int) Math.ceil(Math.random()*100);
        int cont, player;
        Scanner lector = new Scanner(System.in);
        System.out.println("Generaré un número aleatorio entre 1 y 100. ¿Cuantos intentos quieres?");
        cont = Integer.parseInt(lector.nextLine());
        while (cont>0){
            System.out.println("Introduce el número: ");
            player = Integer.parseInt(lector.nextLine());
            if (num>player){
                System.out.println("Más alto");
            }
            else if (num<player){
                System.out.println("Más bajo");
            }
            else {
                System.out.println();
                System.out.println("¡Has acertado el número!");
                cont=-1;
            }
            cont--;
        }
        if (cont==0) {
            System.out.println();
            System.out.println("Número de intentos agotado, has perdido.");
        }
        System.out.println("Juego acabado, el número era "+num+".");
        lector.close();
    }
}
