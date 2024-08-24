package com.mycompany.n1;

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Loja Mamão com Açúcar - Parcelamento em 5 vezes sem juros!");

        System.out.print("Informe o valor total da compra: ");
        double totalCompra = scanner.nextDouble();

        int numPrestacoes = 5;

        double valorPrestacoes = totalCompra / numPrestacoes;

        System.out.printf("O valor de cada prestação em 5 vezes sem juros é: R$ %.2f", valorPrestacoes);

        scanner.close();
    }
}