import javax.swing.*;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mediaAritimetica = 0;
        int qtdValoresPares = 0;
        int qtdValoresImpares = 0;
        int porcentagemValorPar;
        int porcentagemValorImpar;
        int soma = 0;
        int cont = 0;

        int valorA = 0;
        while (valorA != (-1)) {
            System.out.println("Informe um número inteiro e positivo;");
            valorA = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro e positivo"));

            if (valorA >= 0) {
                soma = soma + valorA;
                cont = cont + 1;

                if (valorA % 2 == 0) {
                    qtdValoresPares = qtdValoresPares + 1;
                } else {
                    qtdValoresImpares = qtdValoresImpares + 1;
                }
            }
        }

        mediaAritimetica = soma / cont;


        porcentagemValorPar = qtdValoresPares * 100 / cont;
        porcentagemValorImpar = qtdValoresImpares * 100 / cont;

        System.out.println("A média aritimética é: " + mediaAritimetica);

        System.out.println("A quantidade de valores lidos PARES é: " + qtdValoresPares);
        System.out.println("A quantidade de valores lidos IMPARES é: " + qtdValoresImpares);

        System.out.println("O percentual de PARES é: " + porcentagemValorPar);
        System.out.println("O percentual de IMPARES é: " + porcentagemValorImpar);
    }
}
