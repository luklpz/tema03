package com.lukalopez.tema03.ANSI;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String args[]) {

        //Asignamos variables
        String city;
        boolean valid=false;
        boolean leap=false;
        int year, month, day, mDays=0, hour, min, sec, pRain, uvi, xColor, windVel;
        float degrees, atm;

        System.out.println("\nEn este programa representaremos los datos de tu estación meteorológica, para ello comenzaremos con la recopilación de tus datos.\n");

        //Iniciamos recopilación de datos
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cuál es tu ciudad?");
        city = lector.nextLine();

        //Pedimos la fecha de hoy
        //Año
        do {
            System.out.println("\n¿En qué año estamos?");
            year = Integer.parseInt(lector.nextLine());
            if (year>2000&&year<2100){
                valid=true;
                if (((year % 4 == 0)&&(year % 100 !=0))||(year % 400 == 0)){
                    leap=true;

                }
                else {
                    System.out.println("Dato no válido.\n");
                }
            }
            else {
                System.out.println("Dato no válido.\n");
            }
        } while (!valid);
        valid=false;

        //Mes
        do {
            System.out.println("\n¿En qué mes estamos?");
            month = Integer.parseInt(lector.nextLine());
            if (month>0&&month<13){
                valid=true;
                switch (month){
                    case 1,3,5,7,8,10,12:
                        mDays=31;
                        break;
                    case 2:
                        if (!leap){
                            mDays=28;
                        }
                        else {
                            mDays=29;
                        }
                        break;
                    case 4,6,9,11:
                        mDays=30;
                        break;
                    default:
                        mDays=30;
                }
            }
            else {
                System.out.println("Dato no válido.\n");
            }
        } while (!valid);
        valid=false;

        //Dia
        do {
            System.out.println("\n¿En qué dia del mes estamos?");
            day = Integer.parseInt(lector.nextLine());

            if (day>0&&day<(mDays+1)){
                valid=true;
            }
            else {
                System.out.println("Dato no válido.\n");
            }
        } while (!valid);
        valid=false;


        //Hora de la medida
        //Segundos
        System.out.println("\n\nA continuación introducirás la hora actual.");
        do {
            System.out.println("Introduce los segundos:");
            sec = Integer.parseInt(lector.nextLine());

            if (sec>-1&&sec<60){
                valid=true;
            }
            else {
                System.out.println("Dato no válido.\n");
            }
        } while (!valid);
        valid=false;

        //Minutos
        do {
            System.out.println("\nIntroduce los minutos:");
            min = Integer.parseInt(lector.nextLine());

            if (min>-1&&min<60){
                valid=true;
            }
            else {
                System.out.println("Dato no válido.\n");
            }
        } while (!valid);
        valid=false;

        //Horas
        do {
            System.out.println("\nIntroduce las horas:");
            hour = Integer.parseInt(lector.nextLine());

            if (hour>-1&&hour<24){
                valid=true;
            }
            else {
                System.out.println("Dato no válido.\n");
            }
        } while (!valid);
        valid=false;


        //Velocidad del viento Km/h
        do {
            System.out.println("\n\nIntroduce la velocidad del viento en Km/h:");
            windVel = Integer.parseInt(lector.nextLine());
            if (windVel>=0){
                valid=true;
            }
            else {
                System.out.println("Dato no válido.\n");
            }
        } while (!valid);
        valid=false;


        //Temperatura ºC
        do {
            System.out.println("\n\nIntroduce la temperatura:");
            degrees = Float.parseFloat(lector.nextLine());
            if (degrees>-275.14){
                valid=true;
            }
            else {
                System.out.println("Dato no válido.\n");
            }
        } while (!valid);
        valid=false;


        //Presión atmosférica
        do {
            System.out.println("\n\nIntroduce la presión atmosférica:");
            atm = Float.parseFloat(lector.nextLine());
            if (atm>=0){
                valid=true;
            }
            else {
                System.out.println("Dato no válido.\n");
            }
        } while (!valid);
        valid=false;


        //Probabilidad de lluvia
        do {
            System.out.println("\n\nIntroduce la probabilidad de que llueva:");
            pRain = Integer.parseInt(lector.nextLine());
            if (pRain>-1&&pRain<101){
                valid=true;
            }
            else {
                System.out.println("Dato no válido.\n");
            }
        } while (!valid);
        valid=false;


        //Radiación ultravioleta
        do {
            System.out.println("\n\nIntroduce el índice de radiación ultravioleta:");
            uvi = Integer.parseInt(lector.nextLine());
            if (uvi>0) {
                valid=true;
            }
            else {
                System.out.println("Dato no válido.\n\n\n");
            }
        } while (!valid);
        valid=false;



        //Imprimimos los valores
        System.out.print("\u001B[1;37;44m*** DATOS ESTACIÓN METEOROLÓGICA ***\u001B[0m\n");
        System.out.printf("%-24s%s\n","Ciudad:",city);
        System.out.printf("%-24s%02x%s%02x%s%s\n","Fecha:",day,"/",month,"/",year);
        System.out.printf("%-24s%02x%s%02x%s%02x\n","Fecha:",hour,":",min,":",sec);

        //Color de la velocidad del viento
        if (windVel<30){
            xColor=2;
        }
        else if (windVel<61){
            xColor=3;
        }
        else {
            xColor=1;
        }
        System.out.printf("%-24s\u001B[1;3%xm%x\u001B[0m Km/h\n","Velocidad viento:",xColor,windVel);


        //Color de la temperatura
        if (degrees<22){
            xColor=4;
        }
        else if (degrees<28){
            xColor=2;
        }
        else if (degrees<36){
            xColor=3;
        }
        else {
            xColor=1;
        }
        System.out.printf("%-24s\u001B[1;3%xm%.2f\u001B[0m Cº\n","Temperatura:",xColor,degrees);


        //Presión atmosférica
        System.out.printf("%-24s%.1s hPa\n","Presión atmosférica:",atm);

        //Probabilidad de lluvia
        if (pRain<35){
            xColor=2;
        }
        else if (pRain<71) {
            xColor = 3;
        }
        else {
            xColor=1;
        }
        System.out.printf("%-24s\u001B[1;3%xm%x\u001B[0m","Probabilidad lluvia:",xColor,pRain);
        System.out.println(" %");

        //Radiación
        if (uvi<3){
            xColor=2;
        }
        else if (uvi<6) {
            xColor = 4;
        }
        else if (uvi<8){
            xColor=3;
        }
        else if (uvi<11){
            xColor=1;
        }
        else {
            xColor=5;
        }

        System.out.printf("%-24s\u001B[1;3%xm%x\u001B[0m","UVI:",xColor,uvi);
    }
}
