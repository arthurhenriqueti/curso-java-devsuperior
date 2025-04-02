package Ex04;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int in = 0;
        int out = 0;

        for(int i = 1; i <= numero; i++) {
            int numeros = sc.nextInt(); // Variável local

            if(numeros >= 10 && numeros <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.printf("%d in%n", in);
        System.out.printf("%d out", out);

        sc.close();
    }
}
