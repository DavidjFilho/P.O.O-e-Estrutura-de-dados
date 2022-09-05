import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Numero do funcionario: ");
        Integer numeroFuncionario = input.nextInt();
        System.out.println("Quantidade de horas trab: ");
        Integer quantidadeHrsTrab = input.nextInt();
        System.out.println("Valor por hora: ");
        Double recebeHora = input.nextDouble();
        Double salario = quantidadeHrsTrab * recebeHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARIO = U$ %.2f\n", salario);
    }
}
