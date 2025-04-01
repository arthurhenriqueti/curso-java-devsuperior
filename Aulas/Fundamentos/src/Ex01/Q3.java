package Ex01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vA = sc.nextInt();
        int vB = sc.nextInt();
        int vC = sc.nextInt();
        int vD = sc.nextInt();

        System.out.printf("DIFERENCA = %d", (vA * vB - vC * vD));

        sc.close();
    }
}
