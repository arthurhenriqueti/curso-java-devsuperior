package ConstrutorSintaxe;

/*
Classe,
Atributos,
Construtores,
Get e Set,
Métodos.
*/

public class Aluno {
    private String nome;
    private int idade;
    private char sexo;

    public Aluno() {} // Construtor padrão

    public Aluno(String nome, int idade, char sexo) { // Construtor com parâmetros (argumentos)
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
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

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void exibirInfo() {
        System.out.printf("Nome: %s, Idade: %d, Sexo: %c%n", this.nome, this.idade, this.sexo);
    }
}
