import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();
        int PROD = X * Y;

        System.out.println("PROD= " + PROD);


        input.close();

    }
}
