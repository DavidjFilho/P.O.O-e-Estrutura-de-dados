public class Application {
    public static void main(String[] args) {

        Programador programador = new Programador();
        Cabecalho cabecalho = new Cabecalho();
        Rodape rodape = new Rodape();
        programador.setNome("David Jorge");
        programador.setSalario(5000);
        programador.setAumento(10.0);
        programador.setLinguagens("Java , JS.");
        cabecalho.setText1("Dados do programador");
        rodape.setText("Fim da pag.");
        programador.imprimir(cabecalho, rodape);



        /*Secretaria secretaria = new Secretaria();
        secretaria.setNome("Luna");
        secretaria.setSalario(1000);
        secretaria.setAumento("10");
        secretaria.setAgenda("Segunda, quarta e sexta. ");
        secretaria.imprimir();

        Gerente gerente = new Gerente();
        gerente.setNome("Thor ");
        gerente.setSalario(4000);
        gerente.setAumento(10.0);
        gerente.setSubordinados("Bob, Tobi. ");
        gerente.imprimir();*/
    }
}
