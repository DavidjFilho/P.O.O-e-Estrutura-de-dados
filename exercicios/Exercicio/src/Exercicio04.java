import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero a ser multiplicado: ");
        Integer A = scanner.nextInt();
        System.out.println("Digite o numero a ser multiplicado: ");
        Integer B = scanner.nextInt();

        Integer Produto = A * B;

        System.out.println("Produto" + Produto);


    }
}