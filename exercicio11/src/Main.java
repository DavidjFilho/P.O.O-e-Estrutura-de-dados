import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args ) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        double raio = input.nextDouble();

        double volEsfera = (4/3.0) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volEsfera);


        input.close();


    }
}
