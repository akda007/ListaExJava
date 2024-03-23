package Biblio;

public class Livro {
    private String titulo, autor;
    private Integer ano;

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }


    public Integer getAno() {
        return ano;
    }

    public void mostrarLivro() {
        System.out.println(String.format("%s: Autor - '%s', Ano - '%d'", titulo, autor, ano));
    }

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
}
