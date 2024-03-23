package AgendaContato;

public class Contato {
    private String nome;
    private int telefone;

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void mostrarInfo(){
        System.out.println(String.format("Nome: %s, Telfone: %d", nome, telefone));
    }

    public Contato(String nome, int tel) {
        this.nome = nome;
        telefone = tel;
    }    
}
