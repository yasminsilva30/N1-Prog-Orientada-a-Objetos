package com.mycompany.n1;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos realizar algumas operações matemáticas!");

        System.out.print("Insira aqui o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Insira aqui o segundo número: ");
        double n2 = scanner.nextDouble();

        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = (n2 != 0) ? (n1 / n2) : Double.POSITIVE_INFINITY;

        System.out.println("Resultado das operações!!!");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (divisao == Double.POSITIVE_INFINITY ? "Poxa, divisão por zero não permitida :( " : divisao));

        scanner.close();
    }
}
