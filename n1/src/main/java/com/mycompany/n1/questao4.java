package com.mycompany.n1;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculando o salário final do vendedor!");

        System.out.print("Insira o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Insira o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("insira o valor total de vendas efetuadas: ");
        double totalVendas = scanner.nextDouble();

        double comissao = totalVendas * 0.15;

        double salarioFinal = salarioFixo + comissao;

        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Salário fixo de R$ " + salarioFixo);
        System.out.println("Total salário final do mês com comissão já inclusa: R$ " + salarioFinal);

        scanner.close();
    }
}
