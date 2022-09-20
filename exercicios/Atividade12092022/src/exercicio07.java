/**
 * Escrever um algoritmo que leia um valor para uma variável N de 1 a 10 e calcule a tabuada de
 * N. Mostre a tabuada na forma: 0 x N = 0, 1 x N = 1N, 2 x N = 2N, ..., 10 x N = 10N.
 */

import javax.swing.*;


public class exercicio07 {
    public static void main(String[] args){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser calculado"));

        for (int i = 0; i < 11 ; i++) {
            System.out.println(valor + "X" + i + "=" + valor * i);
            
        }


    }
}
