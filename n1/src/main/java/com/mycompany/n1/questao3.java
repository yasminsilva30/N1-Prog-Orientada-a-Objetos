package com.mycompany.n1;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Realizando cálculo de consumo médio do seu automóvel!");

        System.out.print("Insira aqui a distância total percorrida em km: ");
        double distancia = scanner.nextDouble();

        System.out.print("Insira aqui o total de combustível gasto (unidade de medida é litros): ");
        double combustivel = scanner.nextDouble();

        double totalConsumoMedio = (combustivel != 0) ? (distancia / combustivel) : Double.POSITIVE_INFINITY;

        System.out.println("O consumo médio do automóvel é: " +
                           (totalConsumoMedio == Double.POSITIVE_INFINITY ? "Poxa, não é possível calcular com zero litros de combustível :( " : totalConsumoMedio + " km/l"));

        scanner.close();
    }
}