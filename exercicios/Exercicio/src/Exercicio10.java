import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o codigo da peça1: ");
        Integer codPeca1 = input.nextInt();

        System.out.println("Digite a quantidade de peça1: ");
        Integer quantPeca1 = input.nextInt();

        System.out.println("Digite o valor da peça1: ");
        Double valorPeca1 = input.nextDouble();

        System.out.println("Digite o codigo da peça2: ");
        Integer codPeca2 = input.nextInt();

        System.out.println("Digite a quantidade de peça2: ");
        Integer quantPeca2 = input.nextInt();

        System.out.println("Digite o valor da peça2: ");
        Double valorPeca2 = input.nextDouble();

        Double custo = quantPeca1 * valorPeca1 + quantPeca2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", custo);
    }
}
