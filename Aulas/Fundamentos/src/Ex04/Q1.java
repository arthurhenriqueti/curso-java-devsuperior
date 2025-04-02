package Ex04;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        for(int i = 0; i <= numero; i++) { // i = i + 1
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
