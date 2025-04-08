package Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];

        for(int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            int idade = sc.nextInt();
            double altura = sc.nextDouble();

            vect[i] = new Pessoa(nome, idade, altura);
        }

        for(int i = 0; i < vect.length; i++) {
            System.out.println(vect[i].toString());
        }

        sc.close();
    }
}
