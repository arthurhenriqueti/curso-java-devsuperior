package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for(int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();

            vect[i] = new Produto(nome, preco);
        }

        for(int i = 0; i < vect.length; i++) {
            System.out.println(vect[i].toString());
        }
    }
}
