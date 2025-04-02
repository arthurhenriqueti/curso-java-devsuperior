package Ex04;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd = sc.nextInt();

        for(int i = 1; i <= qtd; i++) {
            double v1 = sc.nextDouble();
            double v2 = sc.nextDouble();
            double v3 = sc.nextDouble();

            System.out.printf("%.1f%n", (((v1 * 2) + (v2 * 3) + (v3 * 5)) / 10));
        }

        sc.close();
    }
}
