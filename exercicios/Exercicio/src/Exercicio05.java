import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double A = scanner.nextDouble();
        System.out.println("Digite o segundo valor");
        double B = scanner.nextDouble();
        double MEDIA= ((A * 3.5) + (B * 7.5)) / 11.0;

        System.out.printf("Media = %.5f\n", MEDIA);

    }
}