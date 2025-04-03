import java.util.Scanner;

public class FuncoesSintaxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int resultado = somar(n1, n2);
        exibirResultado(resultado);

        String minhasInfo = apresentar();

        System.out.println(minhasInfo);
    }

    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static void exibirResultado(int resultado) {
        System.out.printf("O resultado da soma é %d%n", resultado);
    }

    public static String apresentar() {
        String nome = "Arthur";
        int idade = 26;
        char sexo = 'M';
        double salario = 2500.00;

        return "Nome: " + nome + " | Idade: " + idade + " | Sexo: " + sexo + " | Salário: " + salario;
    }
}
