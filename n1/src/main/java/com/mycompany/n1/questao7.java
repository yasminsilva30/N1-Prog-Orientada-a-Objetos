package com.mycompany.n1;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Convertendo a temperatura de Celsius para Fahrenheit :) ");

        System.out.print("Insira a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

        scanner.close();
    }
}
