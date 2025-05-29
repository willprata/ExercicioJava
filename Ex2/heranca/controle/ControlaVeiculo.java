package Exercicios02.heranca2.controle;

import Exercicios02.heranca2.dominio.*; // Importa as classes do pacote dominio

public class ControlaVeiculo {
    public static void main(String[] args) {
        
        Carro meuCarro = new Carro("Toyota", "Corolla", 2023, 4);

        Moto minhaMoto = new Moto("Honda", "CB 500", 2022, 500);

        System.out.println("Detalhes dos Veículos:");
        System.out.println("--------------------");

        meuCarro.exibirDados();
        System.out.println("--------------------");

        minhaMoto.exibirDados();
        System.out.println("--------------------");
    }
}

