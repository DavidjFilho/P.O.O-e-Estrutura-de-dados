import javax.swing.*;


public class exercicio04 {
    public static void main(String[] args){
        int numero = -1;
        int quantidade1 = 0;
        int quantidade2 = 0;
        int quantidade3 = 0;
        int quantidade4 = 0;
        int quantidadeForaDoIntervalo = 0;

        while (numero >= 0) {

            System.out.println("Informe um numero");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));


            if ((numero <= 0) || (numero > 100)) {
                quantidadeForaDoIntervalo = quantidadeForaDoIntervalo + 1;
            } else {
                if ((numero >= 0) && (numero <= 25)) {
                    quantidade1 = quantidade1 + 1;
                }

                if ((numero >= 26) && (numero <= 50)) {
                    quantidade2 = quantidade2 + 1;
                }

                if ((numero >= 51) && (numero <= 75)) {
                    quantidade3 = quantidade3 + 1;
                }

                if ((numero >= 76) && (numero <= 100)) {
                    quantidade4 = quantidade4 + 1;
                }
            }

        }

        System.out.println("Quantidade de números no intervalo de 0 a 25, é de " + quantidade1);
        System.out.println("Quantidade de números no intervalo de 25 a 50, é de " + quantidade2);
        System.out.println("Quantidade de números no intervalo de 50 a 75, é de " + quantidade3);
        System.out.println("Quantidade de números no intervalo de 75 a 100, é de " + quantidade4);
        System.out.println("Quantidade de números fora do intervalo, é de" + quantidadeForaDoIntervalo);
    }
}
