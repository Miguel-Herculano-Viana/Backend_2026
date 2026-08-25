package Aula_4;

public class Servico {
    private String codigo;
    private String nome;
    private String descricao;
    private boolean ativo;

    public Servico(String codigo, String nome, String descricao){
        setCodigo(codigo);
        setNome(nome);
        setDescricao(descricao);
    }
    public String getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public String getDescricao(){
        return descricao;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public boolean isAtivo(){
        return ativo;
    }
    public void ativar(){
        this.ativo = true;
    }
    public void desativar(){
        this.ativo = false;
    }

    public void exibirResumo(){
        System.out.println("\n - Resumo do Serviço - ");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Ativo? " + ativo);
    }
}
