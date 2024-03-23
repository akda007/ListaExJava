package AgendaContato;

import java.util.ArrayList;
import java.util.Scanner;


public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();
    
    
    //Procurar pelo contato
    private Contato consultarContato(String nome) {
        return contatos.stream().filter(x -> x.getNome().equals(nome)).findFirst().get();
    }


    public void consultarContato(Scanner sc) {
        System.out.println("Digite o nome da contato: ");
        String nome = sc.nextLine();

        Contato contato = consultarContato(nome);

        contato.mostrarInfo();
    }

    public void addContato(Scanner sc) {
        System.out.println("Digite o nome do contato: ");
        String nome = sc.nextLine();

        System.out.println("Digite o numero do contato: ");
        int tel = sc.nextInt(); sc.nextLine();

        contatos.add(new Contato(nome, tel));
    }

    public void todosContatos() {
        for (Contato c : contatos) {
            c.mostrarInfo();
            System.out.println("=====================");
        }
    }
}

