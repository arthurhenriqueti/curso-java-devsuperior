package ConstrutorSintaxe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        int idade = sc.nextInt();
        char sexo = sc.next().charAt(0);

        Aluno aluno1 = new Aluno(nome, idade, sexo);

        aluno1.exibirInfo();

        // aluno1.nome = "aa"; -> Atributo privado, não é possível acessar
        aluno1.setNome("Gustavo");
        System.out.println(aluno1.getNome());

        aluno1.exibirInfo();

        sc.close();
    }
}
