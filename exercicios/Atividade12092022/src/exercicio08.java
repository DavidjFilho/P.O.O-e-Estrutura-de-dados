/**
 *  Escreva um algoritmo que leia um valor inicial A e uma razão R e imprima uma seqüência em
 * P.A. contendo 10 valores.
 */
import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double r = scanner.nextDouble();
        double result = a;
        for (int i = 0; i < 10 ; i++) {
            System.out.println(result);
            result += r;
            
        }


        }


    }


