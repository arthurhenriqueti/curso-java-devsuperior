package Ex02;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorX = sc.nextDouble();
        double valorY = sc.nextDouble();

        if(valorY > 0 && valorX > 0) {
            System.out.println("Q1");
        } else if(valorY > 0 && valorX < 0) {
            System.out.println("Q2");
        } else if(valorY < 0 && valorX < 0) {
            System.out.println("Q3");
        } else if(valorY < 0 && valorX > 0) {
            System.out.println("Q4");
        } else {
            System.out.println("Origem");
        }

        sc.close();
    }
}
