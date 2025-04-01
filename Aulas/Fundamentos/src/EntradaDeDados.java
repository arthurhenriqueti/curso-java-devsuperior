import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Classe Objeto = Nova Instância(Construtor)

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Sexo: ");
        char sexo = sc.next().charAt(0);

        Locale.setDefault(Locale.US);

        System.out.print("Salário: R$ ");
        double salario = sc.nextDouble();
        System.out.print("Ativo? (true/false) ");
        boolean ativo = sc.nextBoolean();

        System.out.printf("Nome: %s, Idade: %d, Sexo: %c, Salário: R$ %.2f, Ativo: %b", nome, idade, sexo, salario, ativo);

        sc.close();
    }
}
