package Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produto = criarProduto();

        exibirProduto(produto);
        addProduto(produto);
        exibirProduto(produto);
        remProduto(produto);
        exibirProduto(produto);
    }

    public static Produto criarProduto() {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Entre com o produto:");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        produto.quantidade = sc.nextInt();

        return produto;
    }

    public static void exibirProduto(Produto produto) {
        System.out.println(produto);
    }

    public static void addProduto(Produto produto) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a quantidade para adicionar ao estoque: ");
        int quantidade = sc.nextInt();
        produto.addProduto(quantidade);
    }

    public static void remProduto(Produto produto) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a quantidade para remover do estoque: ");
        int quantidade = sc.nextInt();
        produto.remProduto(quantidade);

        sc.close();
    }
}
