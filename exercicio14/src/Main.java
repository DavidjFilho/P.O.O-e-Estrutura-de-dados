import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args ) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int distPerc = input.nextInt();
        double quantCombust = input.nextDouble();

        double mediaCombustGasto = distPerc / quantCombust;


        System.out.printf("%.3f km/l%n", mediaCombustGasto);

        input.close();

    }
}