package Enumeracoes;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String status = sc.nextLine();

        Pedido pedido01 = new Pedido(1020, new Date(), OrderStatus.valueOf(status));

        System.out.println(pedido01);
        System.out.println(pedido01.getStatus());

        sc.close();
    }
}
