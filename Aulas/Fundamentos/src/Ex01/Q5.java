package Ex01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int qtd1 = sc.nextInt();
        double valor1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int qtd2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f", ((qtd1 * valor1) + (qtd2 * valor2)));

        sc.close();
    }
}
