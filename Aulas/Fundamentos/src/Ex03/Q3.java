package Ex03;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while(opcao != 4) {
            if(opcao == 1) {
                alcool++;
            } else if(opcao == 2) {
                gasolina++;
            } else if(opcao == 3) {
                diesel++;
            }

            opcao = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);

        sc.close();
    }
}
