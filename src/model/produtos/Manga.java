package model.produtos;

/**
 * Classe que representa o produto Manga.
 */

public class Manga extends Produto {

    public Manga(int id, String nome, double preco, int estoque, String autor, String categoria) {
        super(id, nome, preco, estoque, autor, categoria);
    }

    public void exibirInfo() {
        System.out.println("Manga - " + getNome() + "  Preço: " + getPreco() + "  Estoque: " + getEstoque());
    }

}
