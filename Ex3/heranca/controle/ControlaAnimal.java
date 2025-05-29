package Exercicios03.heranca3.controle;

import Exercicios03.heranca3.dominio.*; // Importa as classes do pacote dominio

public class ControlaAnimal {
    public static void main(String[] args) {
        
        Cachorro meuCachorro = new Cachorro("Rex", 5);

        Gato meuGato = new Gato("Mia", 3);

        System.out.println("Detalhes dos Animais:");
        System.out.println("--------------------");

        System.out.println("Tipo: Cachorro");
        System.out.println("Nome: " + meuCachorro.getNome());
        System.out.println("Idade: " + meuCachorro.getIdade());
        System.out.print("Som: ");
        meuCachorro.emitirSom(); // Chama o método emitirSom específico do Cachorro
        System.out.println("--------------------");

        System.out.println("Tipo: Gato");
        System.out.println("Nome: " + meuGato.getNome());
        System.out.println("Idade: " + meuGato.getIdade());
        System.out.print("Som: ");
        meuGato.emitirSom(); // Chama o método emitirSom específico do Gato
        System.out.println("--------------------");
    }
}

