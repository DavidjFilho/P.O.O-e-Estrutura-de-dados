/** 1) Desenvolver um algoritmo que efetue a soma de todos os números ímpares
* que são múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
*/

public class exercicio01 {
    public static void main(String[] args){
        double result = 0;

        for (int i = 0; i <= 500 ; i++) {
            if(i % 3 == 0 && i % 2 != 0){
                result+= i;

            }
        }
        System.out.println("A soma é: " + result);
        }

    }
