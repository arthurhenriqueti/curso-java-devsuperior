import java.util.Scanner;

public class OpAtribuicaoCumulativa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        System.out.println(valor += 10); // valor = valor + 10
        System.out.println(valor -= 10); // valor = valor - 10
        System.out.println(valor *= 10); // valor = valor * 10
        System.out.println(valor /= 10); // valor = valor / 10
        System.out.println(valor %= 10); // valor = valor % 10

        sc.close();
    }
}
