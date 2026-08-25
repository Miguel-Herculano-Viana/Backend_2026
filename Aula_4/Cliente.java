package Aula_4;

public class Cliente {
    private String codigoCti;
    private String segmento;
    private int nivel;
    private String faixaFaturamento;
    private Consultor consultorResponsavel;

    public Cliente(
        String codigoCti,
        String segmento,
        int nivel,
        String faixaFaturamento,
        Consultor consultorResponsavel){
            setCodigoCti(codigoCti);
            setSegmento(segmento);
            setNivel(nivel);
            setFaixaFaturamento(faixaFaturamento);
            setConsultorResponsavel(consultorResponsavel);
        }

        //getter
        public String getCodigoCti(){
            return codigoCti;
        }
        public String getSegmento(){
            return segmento;
        }
        public int getNivel(){
            return nivel;
        }
        public String getFaixaFaturamento(){
            return faixaFaturamento;
        }

        //setter
        public void setCodigoCti(String codigoCti){
            this.codigoCti = codigoCti;
        }
        public void setSegmento(String segmento){
            this.segmento = segmento;
        }
        public void setNivel(int nivel){
            if(nivel >= 1 && nivel <=3){
                this.nivel = nivel;
            }else{
                System.out.println("Erro, o nível deve ser 1, 2 ou 3");
            }
        }
        public void setFaixaFaturamento(String faixaFaturamento){
            this.faixaFaturamento = faixaFaturamento;
        }
        
        //consultor
        public Consultor getConsultorResponsavel(){
            return consultorResponsavel;
        }
        public void setConsultorResponsavel(Consultor consultorResponsavel){
            this.consultorResponsavel= consultorResponsavel;
        }

        public void atualizarNivel(int novoNivel){
            setNivel(novoNivel);
        }
        public void exibirResumo(){
            System.out.println("\n - Resumo do cliente CTI - ");
            System.out.println("código CTI: " + codigoCti);
            System.out.println("Segmento: " + segmento);
            System.out.println("Nivel numerico: " + nivel);
            System.out.println("Faixa de faturamento: " + faixaFaturamento);

        }
}
