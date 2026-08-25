package Aula_4;

public class Consultor {
    private String codigo;
    private String nome;
    private int anosExperiencia;

    public Consultor(String codigo, String nome, int anosExperiencia){
        setCodigo(codigo);
        setNome(nome);
        setAnosExperiencia(anosExperiencia);
    }

    public String getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public int getAnosExperiencia(){
        return anosExperiencia;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAnosExperiencia(int anosExperiencia){
        if (anosExperiencia >= 0){
            this.anosExperiencia = anosExperiencia;
        }else{
            System.out.println("Erro: anos de experiencia não pode ser negativo");
        }
        this.anosExperiencia = anosExperiencia;
    }

    public void exibirResumo(){
        System.out.println(" - Registro Consultor - ");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Anos de Experiencia: " + anosExperiencia);
    }
}
