import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escrevendo {
    public static void main(String[] args) {
        String line = "Testando ...";
        String path = "D:\\dev\\curso-java-devsuperior\\Aulas\\TrabalhandoComArquivos\\NovoTeste.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(line);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
