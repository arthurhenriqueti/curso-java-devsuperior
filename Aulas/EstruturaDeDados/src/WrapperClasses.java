import java.util.Locale;
import java.util.Scanner;

public class WrapperClasses {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = "Arthur";
        Double preco = 2500.00;
        Integer quantidade = 100;
        Character sexo = null;
        Boolean ativo = null;

        Double novoPreco = sc.nextDouble();
        System.out.println(preco.equals(novoPreco));

        System.out.printf("%s, %.2f, %d, %c, %b", nome, preco, quantidade, sexo, ativo);
    }
}
