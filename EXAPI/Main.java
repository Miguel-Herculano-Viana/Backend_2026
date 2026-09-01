package EXAPI;

import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){

        List<Servico> servicos = new ArrayList<>();

        Pessoa pessoa1 = new Consultor("Miguel Herculano", "CON-0004");
        Pessoa pessoa2 = new Cliente("Alpha", "CLI-001", "Industrial", "A");

        pessoa1.exibirInformacoes();
        System.out.println();
        pessoa2.exibirInformacoes();
        System.out.println();

        //Servico servico1 = new Diagnostico("Diagnostico de processos");
        //Servico servico2 = new Consultoria("Consultoria em automação");

        servicos.add(new Diagnostico("Diagnostico de processos"));
        servicos.add(new Consultoria("Consultoria em automacao"));
        servicos.add(new Consultoria("Consultoria de processos"));
        //servico1.executar();
        //servico2.executar();

        for(Servico servico: servicos){
            System.out.println("Serviço: " + servico.getNome());
            servico.executar();
            System.out.println();
        }

        //TelemetriaSucesso sucesso = new TelemetriaSucesso("Execução do serviço", "Sucesso", "Relatorio gerado");
        //TelemetriaErro erro = new TelemetriaErro("Execução do serviço", "Erro", "Falha ao acessar o banco de dados");
        
        Telemetria telemetria1 = new TelemetriaSucesso("Execução do serviço", "Sucesso", "Relatorio gerado");
        Telemetria telemetria2 = new TelemetriaErro("Execução do serviço", "Erro", "Falha ao acessar o banco de dados");

        telemetria1.exibirTelemetria();
        telemetria2.exibirTelemetria();
    }
}