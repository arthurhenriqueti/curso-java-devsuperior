import java.util.Scanner;

public class OpTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();

        String resposta = (valor1 > valor2) ? "Sim" : "Não";

        System.out.printf("%s", resposta);

        sc.close();
    }
}
