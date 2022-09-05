import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero de A: ");
        int A = input.nextInt();
        System.out.println("Digite o numero de B: ");
        int B = input.nextInt();
        System.out.println("Digite o numero de C: ");
        int C = input.nextInt();
        System.out.println("Digite o numero de D: ");
        int D = input.nextInt();
        int DIFERENCA = (A * B - C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
