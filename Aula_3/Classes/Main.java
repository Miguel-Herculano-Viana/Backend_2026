package Classes;

public class Main {
    public static void main(String[] args){

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Miguel";
        aluno1.idade = 18;
        aluno1.nota1 = 8.5;
        aluno1.nota2 = 7.3;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Joao";
        aluno2.idade = 19;
        aluno2.nota1 = 8;
        aluno2.nota2 = 5;

        aluno1.apresentar();
        System.out.println("Media: " + aluno1.calcularMedia(aluno1.nota1, aluno1.nota2));
        System.out.println("Situação: " + aluno1.verificarSituacao() + "\n");

        aluno2.apresentar();
        System.out.println("Media: " + aluno2.calcularMedia(aluno2.nota1, aluno2.nota2));
        System.out.println("Situação: " + aluno2.verificarSituacao() + "\n");
    }
}