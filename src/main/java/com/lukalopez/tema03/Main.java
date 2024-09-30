package com.lukalopez.tema03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica un número: ");
        int i = Integer.parseInt(scanner.nextLine());
        int x = i++;
        int y = ++i;
    }
}