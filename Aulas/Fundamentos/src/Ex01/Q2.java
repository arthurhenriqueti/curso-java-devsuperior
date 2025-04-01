package Ex01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double valorPI = Math.PI;

        System.out.printf("A=%.4f", (valorPI * Math.pow(raio, 2)));

        sc.close();
    }
}
