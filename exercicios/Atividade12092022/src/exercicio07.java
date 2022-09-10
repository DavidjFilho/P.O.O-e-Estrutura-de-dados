import javax.swing.*;
import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args){
        //Scanner scanner = new Scanner(System.in);
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser calculado"));

        for (int i = 0; i < 11 ; i++) {
            System.out.println(valor + "X" + i + "=" + valor * i);
            
        }


    }
}
