package Produto;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEmEstoque() {
        return this.preco * this.quantidade;
    }

    public void addProduto(int quantidade) {
        this.quantidade += quantidade; // this.quantidade = this.quantidade + quantidade (parâmetro)
    }

    public void remProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return "Dados do produto: " + this.nome + ", R$ " + this.preco + ", " + this.quantidade + " unidades, " + "Total: R$ " + this.valorTotalEmEstoque();
    }
}
