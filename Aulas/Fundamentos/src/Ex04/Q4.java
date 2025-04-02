package Ex04;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd = sc.nextInt();

        for(int i = 1; i <= qtd; i++) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            if(n2 == 0) {
                System.out.println("Divisao impossivel");
            } else {
                System.out.printf("%.1f%n", (n1 / n2));
            }
        }

        sc.close();
    }
}
