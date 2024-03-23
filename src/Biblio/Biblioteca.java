package Biblio;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();

    public void registrarLivrr(Scanner sc) {
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Ano: ");
        int ano = sc.nextInt(); sc.nextLine();
        
        livros.add(new Livro(titulo, autor, ano));
    }

    public void consultarLivro(String titulo) {
        Livro livro = livros.stream()
            .filter(x -> x.getTitulo().equals(titulo))
            .findFirst()
            .get();

        livro.mostrarLivro();
    }

    public void mostrarLivrosRegistrados() {
        for (Livro l : livros) {
            l.mostrarLivro();

            System.out.println("============================");
        }
    }
}
