import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vect = new int[3];

        for(int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();
        }

        for(int elemento : vect) {
            System.out.printf("Valor: %d%n", elemento);
        }

        sc.close();
    }
}
