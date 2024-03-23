package CidadeCarro;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCarros {
    private ArrayList<Carro> carros = new ArrayList<>();

    public void cadastrarCarro(Scanner sc) {
        System.out.println("Digite o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.println("Digite a marca do carro: ");
        String marca = sc.nextLine();
        
        System.out.println("Digite o ano do carro: ");
        int ano = sc.nextInt(); sc.nextLine();
        
        carros.add(new Carro(marca, modelo, ano));
    }

    private Carro consultarCarro(String modelo, int ano) {
        return carros.stream().filter(x -> x.getModelo().equals(modelo) && x.getAno() == ano).findFirst().get();
    }


    public void entrarConta(Scanner sc) {
        System.out.println("Digite o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.println("Digite o ano do carro: ");
        int ano = sc.nextInt(); sc.nextLine();

        Carro carro = consultarCarro(modelo, ano);

        carro.mostrarInfo();

        System.out.print("Digite 'A' para acelerar e 'F' para frear: ");
        Character option = sc.nextLine().toLowerCase().charAt(0);

        System.out.print(String.format("Digite o valor para %c: ", option));
        double valor = sc.nextDouble(); sc.nextLine();

        switch (option) {
            case 'a':
                carro.acelerar(valor);
                break;
        
            case 'f':
                carro.frear(valor);
                break;
            default:
                break;
        }

        carro.mostrarInfo();
    }
}
