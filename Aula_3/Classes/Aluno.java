package Classes;

public class Aluno {
    String nome;
    int idade;
    double nota1;
    double nota2;

    void apresentar(){
        System.out.println("Meu nome é " + nome);
        System.out.println("Tenho " + idade + " anos");
    }

    double calcularMedia(double nota1, double nota2){
        return(nota1 + nota2)/2;
    }

    String verificarSituacao(){
        double media = calcularMedia(nota1, nota2);
        if (media >= 7){
            return "Aprovado";
        } else if (media >= 5){
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
    
}
