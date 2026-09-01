package EXAPI;

public class TelemetriaErro extends Telemetria{
    private String mensagemErro;

    public TelemetriaErro(String evento, String status, String mensagemErro){
        super(evento, status);
        this.mensagemErro = mensagemErro;
    }

    public String getMensagemErro(){
        return mensagemErro;
    }

    @Override
    public void exibirTelemetria(){
        super.exibirTelemetria();
        System.out.println("Mensagem do erro: " + mensagemErro);
        System.out.println("Tipo: Falha na execução");
    }
}