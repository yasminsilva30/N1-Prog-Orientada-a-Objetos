package com.mycompany.n1;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Vamos somar!");

        System.out.print("Insira aqui o primeiro número a ser somado: ");
        int n1 = scanner.nextInt();

        System.out.print("Insira aqui o segundo número a ser somado: ");
        int n2 = scanner.nextInt();

        int soma = n1 + n2;

        System.out.println("O resultado da soma dos dois números é: " + soma);

        scanner.close();
    }
}