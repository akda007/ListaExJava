package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    public ArrayList<ContaBancaria> contas = new ArrayList<>(); 

    public void criarConta(Scanner sc) {
        System.out.print("Titular: ");
        String titular = sc.nextLine();

        //Adicionar numero automaticamente
        int num = contas.size() + 1;

        contas.add(new ContaBancaria(num, titular));

        System.out.println(String.format("Id conta: %d", num));
    }

    private ContaBancaria consultarConta(int numero) {
        return contas.stream().filter(x -> x.getNumeroConta() == numero).findFirst().get();
    }


    public void entrarConta(Scanner sc) {
        System.out.println("Digite o numero da conta");
        int numero = sc.nextInt(); sc.nextLine();

        ContaBancaria conta = consultarConta(numero);
        System.out.println("\n\nNumero conta: " + conta.getNumeroConta());
        System.out.println("Saldo conta: " + conta.getNomeTitular());
        System.out.println("Saldo conta: " + conta.getSaldo());

        System.out.print("Digite 'D' para depositar e 'S' para sacar: ");
        Character option = sc.nextLine().toLowerCase().charAt(0);

        System.out.print(String.format("Digite o valor para %c: ", option));
        double valor = sc.nextDouble(); sc.nextLine();

        switch (option) {
            case 's':
                conta.sacar(valor);
                break;
        
            case 'd':
                conta.depositar(valor);
                break;
            default:
                break;
        }

        System.out.println("\n\nSaldo conta: " + conta.getSaldo());
    }
}
