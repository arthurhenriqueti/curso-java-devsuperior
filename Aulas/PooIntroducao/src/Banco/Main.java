package Banco;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Banco banco;

        System.out.print("Enter account number: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String nome = sc.nextLine();

        System.out.print("Is there na initial deposit? (Yes/No): ");
        String resp = sc.nextLine();

        if(resp.equals("Yes")) {
            System.out.print("Enter initial deposit value: ");
            double saldo = sc.nextDouble();

            banco = new Banco(numeroConta, nome, saldo);
        } else {
            banco = new Banco(numeroConta, nome);
        }

        System.out.println("Account data:");
        banco.exibirInfo();

        System.out.print("Enter a deposit value: ");
        double saldo = sc.nextDouble();
        banco.efetuarDeposito(saldo);

        System.out.println("Update account data:");
        banco.exibirInfo();

        System.out.print("Enter a withdraw value: ");
        saldo = sc.nextDouble();
        banco.efetuarSaque(saldo);

        System.out.println("Update account data:");
        banco.exibirInfo();
    }
}
