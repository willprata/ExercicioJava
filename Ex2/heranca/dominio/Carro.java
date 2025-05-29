package Exercicios02.heranca2.dominio;


public class Carro extends Veiculo {
    private int quantidadePortas;


    public Carro(String marca, String modelo, int ano, int quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }
    public int getQuantidadePortas() {
        return quantidadePortas;
    }
    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
    @Override
    public void exibirDados() {
        System.out.println("Tipo: Carro");
        super.exibirDados(); // Chama o método da classe pai para exibir marca, modelo, ano
        System.out.println("Quantidade de Portas: " + this.quantidadePortas);
    }
}




