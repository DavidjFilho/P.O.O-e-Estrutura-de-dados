import java.util.Scanner;

public class Exercicio11 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        Double pi = 3.14159;
        Double raio = input.nextDouble();

        Double volEsfera = (4/3.0) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volEsfera);
    }
}
