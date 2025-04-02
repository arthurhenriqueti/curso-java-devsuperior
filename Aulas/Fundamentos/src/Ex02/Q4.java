package Ex02;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;

        if(horaInicial < horaFinal) {
            duracao = horaInicial - horaFinal;
            System.out.printf("O JOGO DUROU %d HORA(S)", Math.abs(duracao));
        } else {
            duracao = horaInicial - horaFinal - 24;
            System.out.printf("O JOGO DUROU %d HORA(S)", Math.abs(duracao));
        }

        sc.close();
    }
}
