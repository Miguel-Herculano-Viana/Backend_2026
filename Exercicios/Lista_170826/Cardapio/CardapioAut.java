package Exercicios.Lista_170826.Cardapio;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CardapioAut {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Double> cardapio = new HashMap<>();

        cardapio.put("Hamburguer", 20.00);
        cardapio.put("Pizza", 35.00);
        cardapio.put("Cachorro-Quente", 15.00);
        cardapio.put("Refrigerante", 8.00);

        System.out.print("-- Cardapio Digital Intertivo --\n");
        System.out.print("-- Escolha uma Opção abaixo --\n");
        
        int i = 1;
        for (Map.Entry< String, Double > opcao : cardapio.entrySet()){
            System.out.printf("%d. %s | R$%.2f\n", i, opcao.getKey(), opcao.getValue());
            i += 1;
        }

        System.out.printf("Selecione a opção que deseja: ");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.printf("Produto: Hamburguer\n" + "Preço: R$20.00\n");
                break;
            case 2:
                System.out.printf("Produto: Pizza\n" + "Preço: R$35.00\n");
                break;
            case 3:
                System.out.printf("Produto: Cachorro-Quente\n" + "Preço: R$15.00\n");
                break;
            case 4:
                System.out.printf("Produto: Refrigerante\n" + "Preço: R$8.00\n");
                break;
            default:
                System.out.print("A opção escolhida não existe\n");
                break;
        }
        sc.close();
    }
}
