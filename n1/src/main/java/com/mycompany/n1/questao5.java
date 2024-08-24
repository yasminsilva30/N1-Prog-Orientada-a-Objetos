package com.mycompany.n1;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculando a média das notas do aluno");

        System.out.print("Insira o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Insira a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.print("insira a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Insira a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Cálculo realizado!");
        System.out.println("Segue abaixo o nome do aluno e sua média");
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Média das Notas: " + media);

        scanner.close();
    }
}
