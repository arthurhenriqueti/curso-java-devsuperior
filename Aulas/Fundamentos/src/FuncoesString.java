public class FuncoesString {
    public static void main(String[] args) {
        System.out.println("Hello World".toLowerCase());
        System.out.println("Hello World".toUpperCase());
        System.out.println(" Hello World ".trim());
        System.out.println("Hello World".substring(0, 5));
        System.out.println("Hello World".replace("Hello World", "Olá Mundo"));
        System.out.println("Hello World".indexOf("H"));
        System.out.println("Hello World".lastIndexOf("d"));

        String s = "potato apple lemon";

        String[] vetor = s.split(" ");

        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
    }
}
