import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int controle = sc.nextInt();

        while(controle != 0) {
            System.out.println("Continue...");
            controle = sc.nextInt();
        }

        sc.close();
    }
}
