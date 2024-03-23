package Bank;

public class ContaBancaria {
    private int numeroConta;
    public int getNumeroConta() {
        return numeroConta;
    }

    private double saldo;
    public double getSaldo() {
        return saldo;
    }

    private String nomeTitular;
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    
    public ContaBancaria(int numero, String titular) {
        numeroConta = numero;
        nomeTitular = titular;
        saldo = 0;
    }
}
