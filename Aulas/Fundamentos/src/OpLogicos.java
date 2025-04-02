import java.util.Scanner;

public class OpLogicos {
    public static void main(String[] args) {
        // && || ! (AND, OR, NOT)

        Scanner sc = new Scanner(System.in);

        int hora = sc.nextInt();

        if(hora >= 0 && hora <= 12) {
            System.out.println("Bom dia!");
        } else if(hora >= 13 && hora <= 18) {
            System.out.println("Boa tarde!");
        } else if(hora >= 19 && hora <= 23) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido!");
        }

        sc.close();
    }
}
