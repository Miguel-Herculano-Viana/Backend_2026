package EXAPI;

public class Cliente extends Pessoa{
    private String codigoCTI;
    private String segmento;
    private String nivel;

    public Cliente(
        String nome,
        String codigoCTI,
        String segmento,
        String nivel
    ){
        super(nome);
        this.codigoCTI = codigoCTI;
        this.segmento = segmento;
        this.nivel = nivel;
    }

    public String getCodigoCTI(){
        return codigoCTI;
    }

    public String getSegmento(){
        return segmento;
    }

    public String getNivel(){
        return nivel;
    }

    @Override

    public void exibirInformacoes(){
        System.out.println("=== CLIENTE ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Codigo CTI: " + codigoCTI);
        System.out.println("Nivel: " + nivel);
    }
}
