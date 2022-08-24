import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        String nomeFunc = input.next();
        double salariofixo = input.nextDouble();
        double vendas = input.nextDouble();
        double comissao = vendas * 0.15;
        double salariofinal = salariofixo + comissao;

        System.out.printf("TOTAL = R$ %.2f%n", salariofinal );



        input.close();

    }

}
