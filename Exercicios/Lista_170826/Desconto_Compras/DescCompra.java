package Exercicios.Lista_170826.Desconto_Compras;

import java.util.Scanner;

public class DescCompra {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor da compra: ");
        double valor = sc.nextDouble();
        double desc10 = (valor * 0.90);
        double desc15 = (valor * 0.85);

        if(valor <= 99.99 && valor >= 0){
            System.out.printf("A compra feita no valor de R$%.2f não é elegivel para descontos\n", valor);
        }else if(valor >= 100.00 && valor <= 499.99){
            System.out.printf("A compra feita no valor de R$%.2f é elegivel a um desconto de 10%%, o novo valor é de: R$%.2f\n", valor, desc10);
        }else if(valor >= 500.00){
            System.out.printf("A compra feita no valor de R$%.2f é elegivel a um desconto de 15%%, o novo valor é de: R$%.2f\n", valor, desc15);
        }
        sc.close();
    }
}
