package com.mycompany.n1;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Trocando os valores de duas variáveis :) ");

        System.out.print("Insira o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Insira o valor de B: ");
        int b = scanner.nextInt();

        int auxiliar;

        System.out.println("Valores originais:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println("Valores trocados!");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        scanner.close();
    }
}