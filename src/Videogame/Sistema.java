package Videogame;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private ArrayList<Jogador> jogadores = new ArrayList<>();

    public void criarConta(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        jogadores.add(new Jogador(nome));
    }

    private Jogador consultarJogador(String nome) {
        return jogadores.stream().filter(x -> x.getNome().equals(nome)).findFirst().get();
    }


    public void entrarConta(Scanner sc) {
        System.out.println("Digite o nome da conta: ");
        String nome = sc.nextLine();

        Jogador conta = consultarJogador(nome);

        System.out.println("\n\nNome conta: " + conta.getNome());
        System.out.println("Nivel conta: " + conta.getNivel());
        System.out.println("Pontuacao conta: " + conta.getPontuacao());

        System.out.print("Digite 'N' para aumentar o nivel e 'P' para aumentar a pontuacao: ");
        Character option = sc.nextLine().toLowerCase().charAt(0);

        System.out.print(String.format("Digite o valor para %c: ", option));
        int valor = sc.nextInt(); sc.nextLine();

        switch (option) {
            case 'n':
                conta.subirNivel(valor);
                break;
        
            case 'p':
                conta.aumentarPontuacao(valor);
                break;
            default:
                break;
        }

        System.out.println("\n\nNivel conta: " + conta.getNivel());
        System.out.println("Pontuacao conta: " + conta.getPontuacao());
    }
}
