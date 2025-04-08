package Pessoas;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa() {}

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public String toString() {
        return "Nome: " + this.getNome() + ", Idade: " + this.getIdade() + ", Altura: " + this.getAltura();
    }
}
