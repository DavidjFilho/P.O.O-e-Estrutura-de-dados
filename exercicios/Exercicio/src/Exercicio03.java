import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor a ser somado: ");
        Integer A = scanner.nextInt();
        System.out.println("Digite o segundo valor a ser somado: ");
        Integer B = scanner.nextInt();

        Integer soma = A + B;
        System.out.println("Soma igual: " + soma);

    }
}
