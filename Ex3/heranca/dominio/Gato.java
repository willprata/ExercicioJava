package Exercicios03.heranca3.dominio;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miando...");
    }
}

