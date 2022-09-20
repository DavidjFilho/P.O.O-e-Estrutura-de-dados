/**
 * Escrever um algoritmo que gera e escreve os números ímpares entre 100 e 200.
 */
public class exercicio06 {
    public static void main(String[] args){
        double impares = 0;
        System.out.println("Os números ímpares são: ");
        for (int i = 100; i < 201 ; i++) {
            if(i % 2 != 0) {

                impares+= i;
                System.out.println(+ i);
            }

        }
    }
}
