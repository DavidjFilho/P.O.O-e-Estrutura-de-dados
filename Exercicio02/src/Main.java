import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi = 3.14159;

        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        double area = pi * Math.pow(raio, 2);

        System.out.println("A=" + area);


        input.close();
    }
}
