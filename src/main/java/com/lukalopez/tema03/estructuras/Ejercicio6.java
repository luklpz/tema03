package com.lukalopez.tema03.estructuras;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        System.out.println("A continuación introduce una cantidad de euros y te diré el mínimo de monedas necesario para representarlo:");
        double euros = Double.parseDouble(lector.nextLine());
        int centimos = (int) (euros*100);
        int monedas200 = centimos/200;
        centimos=centimos - monedas200*200;
        int monedas100 = + centimos/100;
        centimos=centimos - monedas100*100;
        int monedas50 = centimos/50;
        centimos=centimos - monedas50*50;
        int monedas20 = centimos/20;
        centimos=centimos - monedas20*20;
        int monedas10 = centimos/10;
        centimos=centimos - monedas10*10;
        int monedas5 = centimos/5;
        centimos=centimos - monedas5*5;
        int monedas2 = centimos/2;
        centimos=centimos - monedas2*2;
        int monedas1 = centimos;
        System.out.println(euros + "€ pueden representarse con " + monedas200 + " monedas de 2€, " + monedas100 + " monedas de 1€, " + monedas50 + " monedas de 0.50€, " + monedas20 + " monedas de 0.20€, " + monedas10 + " monedas de 0.10€, " + monedas5 + " monedas de 0.05€, " + monedas2 + " monedas de 0.02€ y " + monedas1 + " monedas de 0.01€");
        lector.close();
    }

}
