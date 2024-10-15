package com.lukalopez.tema03.ANSI;

public class Ejercicio3 {
    public static void main(String args[]) {
        for (int i=1;i<10;i++) {
            int esp = (9-i+1);
            System.out.printf("%"+esp+"s","");

            for (int x=1;x<=i;x++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
