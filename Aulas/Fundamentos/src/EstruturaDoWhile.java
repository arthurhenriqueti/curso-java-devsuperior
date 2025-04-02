import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int controle = 0;

        do{ // Executa primeiro e verifica depois
            System.out.println("Continue...");
            controle = sc.nextInt();
        }
        while(controle != 0); // Verificando a variável de controle

        sc.close();
    }
}
