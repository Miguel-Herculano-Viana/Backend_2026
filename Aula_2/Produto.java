package Aula_2;

public class Produto {
    //Caracteristicas do meu produto
    String modelo;
    String marca;
    double preco;
    int quantidade;

    //Ações que o produto pode fazer
    public void mostrarDetalhes(){
        System.out.println("Produto: " + modelo + "," + marca + "\nPreço: " + preco + "\nQuatidade: " + quantidade);
    }
    
    public void main(String[] args){
        Produto p1 = new Produto();
        p1.modelo = "Thinkpad T440P";
        p1.marca = "Lenovo";
        p1.preco = 2500.00;
        p1.quantidade = 10;
        p1.mostrarDetalhes();
    }
}