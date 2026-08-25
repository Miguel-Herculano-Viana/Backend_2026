//Exemplo de programa em Java

import java.util.Scanner;
public class Aula3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");

        String nome = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        double nota_1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota_2 = sc.nextDouble();
        double media = (nota_1 + nota_2)/2;
        System.out.println("\n Aluno: " + nome + "\n Media: " + media);

        if (media >= 7){
            System.out.println("Situação: Aluno Aprovado!");
        }
        else if (media >= 5){
            System.out.println("Situação: Aluno de Recuperação!");
        }
        else{
            System.out.println("Situação: Aluno Reprovado!");
        }
        sc.close();
    }
}