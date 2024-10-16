package com.lukalopez.tema03.ANSI;

public class Ejercicio3 {
    public static void main(String args[]) {
        String cadena = "";
        for (int i=1;i<10;i++){
            cadena = cadena + i;
            System.out.printf("%9s\n",cadena);
        }
    }
}




        /*
        for (int i=1;i<10;i++) {
            int esp = (9-i+1);
            System.out.printf("%"+esp+"s","");

            for (int x=1;x<=i;x++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
} los piratas de silicon valley
*/