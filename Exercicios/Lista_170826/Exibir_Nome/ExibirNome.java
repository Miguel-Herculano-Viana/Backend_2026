package Exercicios.Lista_170826.Exibir_Nome;

import java.util.Scanner;

public class ExibirNome {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");

        String nome = sc.nextLine();
        System.out.println("Olá, " + nome);

        sc.close();
    }
}
