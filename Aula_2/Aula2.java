//cria class carro

package Aula_2; //package tem o nome da pasta

class Carro { //atributos
    //cria uma variavel marca do tipo string
    String marca;
    String cor;

    // criando constutor
    public Carro(String marcaEscolhida, String corEscolhida){
        //this para me referir a um atributo dentro da classe
        this.marca = marcaEscolhida;
        this.cor = corEscolhida;
    }

    //Metodo (ação)
    void buzinar() {
        //exibir mensagem no terminal
        System.out.println("BIBIII");
    }
}