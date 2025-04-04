package Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangulo.a = sc.nextDouble();
        Triangulo.b = sc.nextDouble();
        Triangulo.c = sc.nextDouble();

        double area = Triangulo.calcularArea(Triangulo.a, Triangulo.b);

        Triangulo.exibirArea(area);

        Triangulo.a = sc.nextDouble();
        Triangulo.b = sc.nextDouble();
        Triangulo.c = sc.nextDouble();

        area = Triangulo.calcularArea(Triangulo.a, Triangulo.b);

        Triangulo.exibirArea(area);

        Triangulo t = new Triangulo();
        System.out.println(t); // Para chamar o "toString" é necessário instanciar um objeto

        sc.close();
    }
}
