package Exercicios.Lista_170826.Verificar_Idade;

import java.util.Scanner;

public class VerificarIdade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");

        int idade = sc.nextInt();

        if(idade < 18){
            System.out.println("Você é menor de idade");
        } else {
            System.out.println("Você é Maior de idade");
        }
        sc.close();
    }
}
