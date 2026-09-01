package EXAPI;

public class Servico {
    private String nome;
    private String categoria;

    public Servico(String nome, String categoria){
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome(){
        return nome;
    }

    public String getCategoria(){
        return categoria;
    }

    public void executar(){
        System.out.println("Executando Serviço...");
    }
}
