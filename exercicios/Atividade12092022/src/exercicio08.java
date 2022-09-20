import javax.swing.*;
import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 2;
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o início da P.A: "));

        for (int i = 2; i <= 10 ; i++) {
                System.out.println(valor + r);
            }

        }


    }


