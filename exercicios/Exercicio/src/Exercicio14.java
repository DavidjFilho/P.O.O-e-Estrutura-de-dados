public class Exercicio14 {
    public static void main(String[] args){
        Integer km = Util.scanInt("Digite quantos km foram percorridos: ");
        Double l = Util.scanDouble("Digite quantos l de combustível foram gastos: ");
        System.out.printf("%.3f km/l", km/l);
    }
}
