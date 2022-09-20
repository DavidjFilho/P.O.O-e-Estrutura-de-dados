/*
Desenvolver um algoritmo que leia um número não determinado de valores e calcule e escreva a
média aritmética dos valores lidos, a quantidade de valores positivos, a quantidade de valores
negativos e o percentual de valores negativos e positivos.
 */

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit;
        double mediaAritimetica = 0, qtdValoresPositivo = 0, qtdValoresNegativo = 0;
        double porcentagemValorP, porcentagemValorN, soma = 0;


        do {
            System.out.println("Digite um numero: ");
            double number = sc.nextDouble();
            soma += number;
            if (number >= 0) {
                qtdValoresPositivo++;
            } else {
                qtdValoresNegativo++;
            }
            System.out.println("Quer encerrar o programa? se sim digite (S) se não (N) ");
            exit = sc.next();


        } while (!exit.toUpperCase().equals("S"));
        mediaAritimetica = soma / (qtdValoresPositivo + qtdValoresNegativo);
        porcentagemValorP = qtdValoresPositivo / (qtdValoresPositivo + qtdValoresNegativo);
        porcentagemValorN = qtdValoresNegativo / (qtdValoresNegativo + qtdValoresPositivo);

        System.out.println("A quantidade de números postivos é " + (qtdValoresPositivo));
        System.out.println("A quantidade de numeros negativos é " + (qtdValoresNegativo));
        System.out.println("A média aritimétrica é " + (mediaAritimetica));
        System.out.println("A porcentagem de valores positivos é " + (porcentagemValorP));
        System.out.println("A porcentagem de valores negativos é " + (porcentagemValorN));


    }
}
