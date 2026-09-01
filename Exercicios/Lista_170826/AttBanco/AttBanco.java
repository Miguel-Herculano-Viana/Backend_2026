package Exercicios.Lista_170826.AttBanco;

import java.util.Scanner;

public class AttBanco {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu saldo inicial: ");
        double saldo = sc.nextDouble();

        int opcao = 0;

        while(opcao != 4){
            System.out.println("== Banco X ==");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Consulta de Saldo");
            System.out.println("2. Depositar Saldo");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");

            opcao = sc.nextInt();

            switch(opcao){
                default:
                    System.out.println("A opção é invalida");
                    break;
                case 1:
                    System.out.printf("O seu saldo atual é de: R$%.2f\n", saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor para depositar: ");
                    double addSaldo = sc.nextDouble();
                    saldo += addSaldo;
                    System.out.printf("\nDeposito realizado com sucesso! novo saldo: R$%.2f\n", saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor para sacar: ");
                    double remSaldo = sc.nextDouble();
                    if(remSaldo <= saldo){
                        saldo -=remSaldo;
                        System.out.printf("Saque realizado com sucesso! novo saldo: R$%.2f\n", saldo);
                    }else{
                        System.out.println("Saldo insulficiente para saque!\n");
                    }
                    break;
                case 4:
                    System.out.println("O sistema sera encerrado...");
                    break;
            }
        }
        sc.close();
    }
}
