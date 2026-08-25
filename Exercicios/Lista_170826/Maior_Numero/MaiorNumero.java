package Exercicios.Lista_170826.Maior_Numero;

import java.util.Scanner;

public class MaiorNumero {
    public static void veridicarMaior(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro numero: ");
        double numero1 = sc.nextDouble();
        System.out.println("Insira o segundo numero: ");
        double numero2 = sc.nextDouble();

        if(numero1 > numero2){
            System.out.println("O primeiro numero é maior que o segundo");
        } else if(numero1 < numero2){
            System.out.println("O Segundo numero é maior que o primeiro numero");
        } else if(numero1 == numero2){
            System.out.println("Ambos os numeros sao iguais");
        }
        sc.close();
    }
}