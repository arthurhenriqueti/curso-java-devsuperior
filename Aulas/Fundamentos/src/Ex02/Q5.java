package Ex02;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int qtd = sc.nextInt();

        if(codigo == 1) {
            System.out.printf("Total: R$ %.2f", (qtd * 4.00));
        } else if(codigo == 2) {
            System.out.printf("Total: R$ %.2f", (qtd * 4.50));
        } else if(codigo == 3) {
            System.out.printf("Total: R$ %.2f", (qtd * 5.00));
        } else if(codigo == 4) {
            System.out.printf("Total: R$ %.2f", (qtd * 2.00));
        } else if(codigo == 5) {
            System.out.printf("Total: R$ %.2f", (qtd * 1.50));
        } else {
            System.out.println("Código inválido!");
        }

        sc.close();
    }
}
