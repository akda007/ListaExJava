package Videogame;

public class Jogador {
    private int pontuacao;
    public void aumentarPontuacao(int pontuacao) {
        this.pontuacao += pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }
    private String nome;
    public String getNome() {
        return nome;
    }
    private int nivel;
    public void subirNivel(int nivel) {
        this.nivel += nivel;
    }

    public int getNivel() {
        return nivel;
    } 

    public String pegarInformaçoes() {
        return String.format("%s: Pontuaçao - %d, Nivel - %d", nome, pontuacao, nivel);
    }

    public Jogador(String nome) {
        this.nome = nome;
        pontuacao = 0;
        nivel = 0;
    }
}
