package com.mycompany.n1;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Convertendo um valor em dólares para reais :) ");

        System.out.print("Informe a cotação do dólar (R$ por US$): ");
        double cotacaoDol = scanner.nextDouble();

        System.out.print("Insira a quantidade de dólares que você deseja converter para reais (US$): ");
        double quantDol = scanner.nextDouble();

        double valorReal = cotacaoDol * quantDol;

        // Exibe o resultado
        System.out.printf("O valor de US$ %.2f é equivalente a R$ %.2f", quantDol, valorReal);

        scanner.close();
    }
}