import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Arthur");
        list.add("Gustavo");
        list.add("Kalina");
        list.add("Josevaldo");
        list.add("Alex");
        list.add(2, "Marcos");
        System.out.println(list.size());

        list.remove("Marcos");
        list.remove(1);

        list.removeIf(elemento -> elemento.charAt(0) == 'K'); // Função lambda (Predicado)

        System.out.printf("Index of Josevaldo: %s%n", list.indexOf("Josevaldo"));

        for(String elemento : list) {
            System.out.printf("Valor: %s%n", elemento);
        }

        List<String> newList = list.stream().filter(elemento -> elemento.charAt(0) == 'A').toList();

        System.out.println("Nova lista!");

        for(String elemento : newList) {
            System.out.printf("Valor: %s%n", elemento);
        }

        String nome = newList.stream().filter(elemento -> elemento.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(nome);
    }
}
