import javax.swing.*;

public class exercicio10 {
    public static void main(String[] args){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("O fatorial de "));
        long fatorial = 1;


        for (int i = 1; i <= valor ; i++) {
            fatorial = fatorial * i;

        }
        System.out.println(valor + " é " + fatorial);
    }
}