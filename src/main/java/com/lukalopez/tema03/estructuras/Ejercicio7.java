package com.lukalopez.tema03.estructuras;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.println("A continuación calcularemos la cuota que has de pagar al club de golf. Por favor, introduce tu edad: ");
        double cuotabase = 500;
        int edad = Integer.parseInt(lector.nextLine());
        if (edad>65) {
            double cuotafinal = cuotabase*0.5;
            System.out.println("Has de pagar una cuota de " + cuotafinal + "€.");
        }
        else if (edad<18){
            System.out.println("Si tus padres son socios del club introduce 1, si no lo son introduce otro número: ");
            int socio = Integer.parseInt(lector.nextLine());
            if (socio==1){
                double cuotafinal = cuotabase*0.65;
                System.out.println("Has de pagar una cuota de " + cuotafinal + "€.");
            }
            else {
                double cuotafinal = cuotabase*0.75;
                System.out.println("Has de pagar una cuota de " + cuotafinal + "€.");
            }

        }
        else {
            double cuotafinal = cuotabase;
            System.out.println("Has de pagar una cuota de " + cuotafinal + "€.");
        }
        lector.close();
    }
}
