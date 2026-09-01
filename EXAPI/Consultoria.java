package EXAPI;

public class Consultoria extends Servico{
    public Consultoria(String nome){
        super(nome, "Consultoria");
    }

    @Override
    public void executar(){
        System.out.println("Executando colsultoria especializada" + getNome());
    }
}
