package Ex01;

import java.util.Locale;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int qtdHoras = sc.nextInt();
        double valorPorHora = sc.nextDouble();

        System.out.printf("NUMBER = %d%n", numeroFuncionario);
        Locale.setDefault(Locale.US);
        System.out.printf("SALARY = U$ %.2f", (qtdHoras * valorPorHora));

        sc.close();
    }
}
