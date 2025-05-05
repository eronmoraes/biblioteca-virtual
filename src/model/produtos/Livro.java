package model.produtos;

/**
 * Classe que representa o produto Livro.
 */

public class Livro extends Produto {

    public Livro(int id, String nome, double preco, int estoque, String autor, String categoria) {
        super(id, nome, preco, estoque, autor, categoria);
    }

    public void exibirInfo() {
        System.out.println("Livro - " + getNome() + "  Preço: " + getPreco() + "  Estoque: " + getEstoque());
    }

}
