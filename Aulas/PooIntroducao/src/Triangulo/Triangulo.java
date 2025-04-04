package Triangulo;

public class Triangulo {
    public static double a; // Atributos/Dados
    public static double b;
    public static double c;

    public static void exibirArea(double area) { // Méthod/Funcao
        System.out.printf("A área do triângulo é: %.2f%n", area);
    }

    public static double calcularArea(double a, double b) {
        return (a * b) / 2;
    }

    public String toString() { // Sobescrevendo o method "toString" herdado pela classe "Object"
        return "A: " + a + " B: " + b + " C: " + c;
    }
}
