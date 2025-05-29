package Exercicios02.heranca2.dominio;


public class Moto extends Veiculo {
    private int cilindradas;


    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    @Override
    public void exibirDados() {
        System.out.println("Tipo: Moto");
        super.exibirDados(); // Chama o método da classe pai
        System.out.println("Cilindradas: " + this.cilindradas + "cc");
    }
}


