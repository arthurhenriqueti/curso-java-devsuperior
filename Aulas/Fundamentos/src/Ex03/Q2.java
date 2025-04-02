package Ex03;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorX = sc.nextDouble();
        double valorY = sc.nextDouble();

        while(valorX != 0 && valorY != 0) {
            if(valorY > 0 && valorX > 0) {
                System.out.println("Primeiro");
            } else if(valorY > 0 && valorX < 0) {
                System.out.println("Segundo");
            } else if(valorY < 0 && valorX < 0) {
                System.out.println("Terceiro");
            } else if(valorY < 0 && valorX > 0) {
                System.out.println("Quarto");
            } else {
                System.out.println("Origem");
            }

            valorX = sc.nextDouble();
            valorY = sc.nextDouble();
        }

        sc.close();
    }
}
