package model.produtos;

/**
 * Classe que representa o produto Revista.
 */

public class Revista extends Produto {

    public Revista(int id, String nome, double preco, int estoque, String autor, String categoria) {
        super(id, nome, preco, estoque, autor, categoria);
    }

    public void exibirInfo() {
        System.out.println("Revista - " + getNome() + "  Preço: " + getPreco() + "  Estoque: " + getEstoque());
    }

}
