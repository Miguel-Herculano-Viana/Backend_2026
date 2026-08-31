package EXAPI;

public class Main{
    public static void main(String[] args){
        Pessoa pessoa1 = new Consultor("Miguel Herculano", "CON-0004");
        Pessoa pessoa2 = new Cliente("Alpha", "CLI-001", "Industrial", "A");

        pessoa1.exibirInformacoes();
        System.out.println();
        pessoa2.exibirInformacoes();
        System.out.println();
    }
}