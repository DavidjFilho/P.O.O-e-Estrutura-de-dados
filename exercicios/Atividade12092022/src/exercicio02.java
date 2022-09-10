import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double maior = Double.MIN_VALUE;
        Double menor = Double.MAX_VALUE;

        for (int i = 0; i < 4 ; i++) {
            System.out.println("Digite sua alutra: ");
            Double altura = scanner.nextDouble();

            if (maior < altura){
                maior = altura;
            }
            if (menor > altura){
                menor = altura;
            }

        }
        System.out.println("Sua altura é a maior" + maior);
        System.out.println("Sua altura é a maior" + menor);
    }
}
