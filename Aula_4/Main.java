package Aula_4;

public class Main {
    public static void main (String[] args){
        System.out.println("=== CTI Insights Aula 04");
        Consultor consultor = new Consultor(
            "CON-0095", "Miguel Herculano", 2
        );
        // teste

        Servico servico = new Servico(
            "SER-001", "Diagnostico de Processos", "Analise dos produtos"
        );

        Cliente cliente = new Cliente(
            "CTI_001", "Comercio", 1, "Entre R$1 e R$10 MI", consultor
        );

        System.out.println("\n -- Objetos criados -- ");
        System.out.println("Codigo do cliente: " + cliente.getCodigoCti());
        System.out.println("Nome do Consultor: " + consultor.getNome());
        System.out.println("Nome do Serviço: " + servico.getNome());

        System.out.println("\n -- Teste de Nivel Invalido --");
        cliente.setNivel(4);
        System.out.println("Nivel mantido: " + cliente.getNivel());

        System.out.println("\n -- Teste de Nivel Valido --");
        cliente.setNivel(2);
        System.out.println("Novo Nivel: " + cliente.getNivel());

        System.out.println("\n Teste de Experiencia -- ");
        consultor.setAnosExperiencia(-2);
        System.out.println("Experiencia Mandida: " + consultor.getAnosExperiencia() + "Anos");

        System.out.println("Serviço ativo no inicio: " + servico.isAtivo());
        servico.desativar();
        System.out.println("Depois de ativar: " + servico.isAtivo());
        servico.ativar();
        System.out.println("Depois de ativar: " + servico.isAtivo());

        System.out.println("\n -- Relatorio Final -- ");
        System.out.println("Codigo CTI: " + cliente.getCodigoCti());
        System.out.println("Segmento: " + cliente.getSegmento());
        System.out.println("Nivel: " + cliente.getNivel());
        System.out.println("Faixa de Faturamento: " + cliente.getFaixaFaturamento());
        System.out.println("Consultor Responsavel: " + cliente.getConsultorResponsavel().getNome());
        System.out.println("Servoço Escolhido: " + servico.getNome());
        System.out.println("Serviço Ativo? " + servico.isAtivo());

        System.out.println("\n Exemplo Concluido!");
    }
}
