package Exercicios02.heranca2.controle;

import Exercicios02.heranca2.dominio.*; // Importa as classes do pacote dominio

public class ControlaVeiculo {
    public static void main(String[] args) {
        // Instanciando um Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2023, 4);

        // Instanciando uma Moto
        Moto minhaMoto = new Moto("Honda", "CB 500", 2022, 500);

        System.out.println("Detalhes dos Veículos:");
        System.out.println("--------------------");

        // Exibindo dados do Carro
        meuCarro.exibirDados();
        System.out.println("--------------------");

        // Exibindo dados da Moto
        minhaMoto.exibirDados();
        System.out.println("--------------------");
    }
}

