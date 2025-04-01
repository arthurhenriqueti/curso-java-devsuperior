package Ex01;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double vA = sc.nextDouble();
        double vB = sc.nextDouble();
        double vC = sc.nextDouble();

        System.out.printf("TRIANGULO = %.3f%n", ((vA * vC) / 2));
        System.out.printf("CIRCULO = %.3f%n", (Math.PI * Math.pow(vC, 2)));
        System.out.printf("TRAPEZIO = %.3f%n", ((vA + vB) * vC / 2));
        System.out.printf("QUADRADO = %.3f%n", (vB * vB));
        System.out.printf("RETANGULO = %.3f%n", (vA * vB));

        sc.close();
    }
}
