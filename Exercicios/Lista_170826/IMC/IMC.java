package Exercicios.Lista_170826.IMC;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a sua altura em cm: ");
        double altura = sc.nextDouble();
        System.out.println("Insira o seu peso em Kg: ");
        double peso = sc.nextDouble();

        double imc = (peso / (altura * altura));

        if(imc > 0 && imc <= 18.4){
            System.out.printf("O seu IMC é de %f, você está abaixo do peso\n", imc);
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.printf("O seu IMC é de %f, você está no peso ideal\n", imc);
        }else if(imc >= 25 && imc <= 29.9){
            System.out.printf("O seu IMC é de %f, você está acima do peso\n", imc);
        }else{
            System.out.printf("O seu IMC é de %f, você esta com obesidade\n", imc);
        }

        sc.close();
    }
}
