package CidadeCarro;

public class Carro {
    private String marca;
    private String modelo;
    public String getModelo() {
        return modelo;
    }

    private int ano;
    public int getAno() {
        return ano;
    }

    private double velocidade;

    public void mostrarInfo() {
        System.out.println(String.format("Marca: %s, Modelo: %s, Ano: %d, Velocidade: %.2f", marca, modelo, ano, velocidade));
    }

    public void frear(double vel) {
        velocidade -= vel;
    }

    public void acelerar(double vel) {
        velocidade += vel;
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

        velocidade = 0.0;
    }
}
