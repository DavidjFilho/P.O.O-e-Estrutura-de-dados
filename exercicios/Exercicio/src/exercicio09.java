import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Nome do funcionario: ");
        String nomeFunc = input.next();

        System.out.println("Digite seu salario: ");
        Double salariofixo = input.nextDouble();

        System.out.println("Digite o total de suas vendas: ");
        Double vendas = input.nextDouble();

        Double comissao = vendas * 0.15;
        Double salariofinal = salariofixo + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", salariofinal );
    }
}
