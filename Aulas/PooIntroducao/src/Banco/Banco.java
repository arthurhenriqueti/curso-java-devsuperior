package Banco;

public class Banco {
    private int numeroConta;
    private String nome;
    private double saldo;

    public Banco() {}

    public Banco(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public Banco(int numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void efetuarDeposito(double valor) {
        this.saldo += valor; // this.saldo = this.saldo + valor
    }

    public void efetuarSaque(double valor) {
        if(valor > this.saldo) {
            System.out.println("You don't have that balance!");
        } else {
            this.saldo = this.saldo - 5.0 - valor; // this.saldo -= 5 - valor;
        }
    }

    public void exibirInfo() {
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", this.getNumeroConta(), this.getNome(), this.getSaldo());
    }
}
