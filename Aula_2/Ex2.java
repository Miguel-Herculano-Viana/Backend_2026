package Aula_2;

class Animal{
    void emitirSom(){
        System.out.println("O animal emite um som");
    }
}

class Cachorro extends Animal{
    @Override
    void emitirSom(){
        System.out.println("O cachorro faz AuAu");
    }
}

class Vaca extends Animal{
    void emitirSom(){
        System.out.println("A vaca faz muuuuu!");
    }
}

public class Ex2{
    public static void main(String[] args){
        Animal animal1 = new Cachorro();
        Animal animal2 = new Vaca();
        animal1.emitirSom();
        animal2.emitirSom();
    }
}