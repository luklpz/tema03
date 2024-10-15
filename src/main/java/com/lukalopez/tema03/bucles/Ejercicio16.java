package com.lukalopez.tema03.bucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String args[]) {
        int dado, pcporras=0, npcporras=0,cont=0, pcpoints,npcpoints;
        String con;
        Random rand = new Random();
        Scanner lector = new Scanner(System.in);
        System.out.println("Este juego consiste en conseguir más puntos que el rival, siendo el máximo 11. Si te pasas de 11 pierdes. Los puntos son el resultado de tirar un dado.");
        System.out.println();
        while (pcporras<5&&npcporras<5){
            cont+=1;
            System.out.println("Ronda nº"+cont);
            pcpoints=0;
            npcpoints=0;
            do {
                System.out.println();
                System.out.println("A continuación tiraremos tu dado: ");
                System.out.println("Has sacado un " + (dado = rand.nextInt(1,7)));
                pcpoints+=dado;
                System.out.println("La suma de tus dados es "+pcpoints+".");
                if (pcpoints<11) {
                    do {
                        System.out.println("¿Quieres tirar otro dado? (S/N)");
                        con = lector.nextLine();
                        if ((!con.equals("S"))&&(!con.equals(("N")))) {
                            System.out.println("Caracter no válido.");
                        }
                    }while ((!con.equals("S"))&&(!con.equals(("N"))));
                }
                else if (pcpoints>11) {
                    System.out.println("La suma de tus dados es "+pcpoints+" como has superado el 11 has perdido la ronda.");
                    npcporras+=1;
                    con = "N";
                }
                else {
                    System.out.println("Tu puntuación es exactamente 11, has ganado la ronda y sumado dos porras.");
                    pcporras+=2;
                    con = "N";
                }
            } while (con.equals("S"));
            System.out.println();
            System.out.println();
            if (pcpoints<11) {
                do {
                    System.out.println("Tu rival ha tirado un dado: " + (dado = rand.nextInt(1, 7)));
                    npcpoints+=dado;
                    System.out.println("La suma de sus dados es "+npcpoints+".");

                } while (npcpoints<=pcpoints);
                if (npcpoints<11) {
                    System.out.println("Ha igualado o superado tu puntuación sin pasarse de 11.");
                    System.out.println("Tu rival suma una porra.");
                    npcporras+=1;
                }
                else if (npcpoints==11) {
                    System.out.println("Ha igualado los 11 puntos.");
                    System.out.println("Tu rival suma dos porras.");
                    npcporras+=2;
                }
                else {
                    System.out.println("Se ha pasado de los 11 puntos.");
                    System.out.println("Ganas la ronda y sumas una porra.");
                    pcporras+=1;
                }
            }
            System.out.println();
            System.out.println();
            System.out.println("Tus porras: "+pcporras+"     Porras de tu rival: "+npcporras);
            System.out.println();
            System.out.println();
            System.out.println();
        }
        lector.close();
        System.out.println();
        System.out.println();
        System.out.println();
        if (pcporras>4){
            System.out.println("¡Has ganado la partida!");
        }
        else {
            System.out.println("Has perdido la partida.");
        }
    }
}
