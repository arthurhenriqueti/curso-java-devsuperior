import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = null;

        File file = new File("D:\\dev\\curso-java-devsuperior\\Aulas\\TrabalhandoComArquivos\\Teste.txt");

        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}