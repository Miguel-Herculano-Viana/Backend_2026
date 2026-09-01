package EXAPI;

public class Diagnostico extends Servico{
    public Diagnostico(String nome){
        super(nome, "Diagnostico");
    }

    @Override
    public void executar(){
        System.out.println("Executando diagnostico do cliente" + getNome());
    }
}
