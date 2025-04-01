package Ex01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        System.out.printf("SOMA = %d", (v1 + v2));

        sc.close();
    }
}
