package Aula_2;

public class Principal {
    //metodo principal para executar o codigo
    public static void main(String[] args){
        //cria objeto
        Carro meuCarro = new Carro("Ferrari", "Preto");
        System.out.println("Carro marca: " + meuCarro.marca + "cor " + meuCarro.cor);

        //atribui uma cor e a marca ao objeto
        meuCarro.marca = "Mitsubishi";
        meuCarro.cor = "Vermelho";
        System.out.println("Marca Carro: " + meuCarro.marca + "\nCor: " + meuCarro.cor);
        meuCarro.buzinar();
    }
    
}
