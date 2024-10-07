package com.lukalopez.tema03.bucles;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Ejercicio3 {
    public static void main(String args[]) {
        float suma, num1, num2;
        int cNeg;
        Scanner lector = new Scanner(System.in);
        System.out.println("En este programa se devolverá el producto de la multiplicación de dos números. A continuación proporciona el primer número:");
        num1 = Float.parseFloat(lector.nextLine());
        System.out.println("Introduce el segundo número: ");
        num2 = Float.parseFloat(lector.nextLine());
        lector.close();
        suma=abs(num1);
        for (float i=1;i<abs(num2);i++){
            suma=suma+abs(num1);
        }
        if ((num1<0&&num2>0)||(num1>0&&num2<0)) {
            cNeg = -1;
            suma=suma*cNeg;
        }
        System.out.println("El resultado de la multiplicación es: " + suma);
    }
}
