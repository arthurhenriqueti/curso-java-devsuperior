package Ex04;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fatorial = 1;

        for(int i = n; i >= 1; i--) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);
        sc.close();
    }
}
