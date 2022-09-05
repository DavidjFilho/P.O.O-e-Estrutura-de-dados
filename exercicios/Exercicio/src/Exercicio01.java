import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        Integer A = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        Integer B = scanner.nextInt();

        Integer X = A + B;
        System.out.println("X = " + X);

    }
}
