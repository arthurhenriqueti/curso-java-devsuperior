package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double media = 0.0;

        double[] vect = new double[n]; // Tamanho fixo e homogêneo (Aceita apenas o tipo definido)

        for(int i = 0; i < n; i++) {
            double notas = sc.nextDouble();
            vect[i] = notas;
            media += vect[i];
        }

        System.out.printf("Média: %.2f", (media / n));
    }
}
