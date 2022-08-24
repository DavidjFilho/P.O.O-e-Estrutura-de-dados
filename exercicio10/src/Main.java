import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args ) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int codPeca1 = input.nextInt();
        int quantPeca1 = input.nextInt();
        double valorPeca1 = input.nextDouble();
        int codPeca2 = input.nextInt();
        int quantPeca2 = input.nextInt();
        double valorPeca2 = input.nextDouble();

        double custo = quantPeca1 * valorPeca1 + quantPeca2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", custo);


    }
}
