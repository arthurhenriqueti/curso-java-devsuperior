package Ex02;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vA = sc.nextInt();
        int vB = sc.nextInt();

        int multiplo, divisor;

        if(vA > vB) {
            multiplo = vA;
            divisor = vB;
        } else {
            multiplo = vB;
            divisor = vA;
        }

        if(multiplo % divisor == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao Sao Multiplos");
        }

        sc.close();
    }
}
