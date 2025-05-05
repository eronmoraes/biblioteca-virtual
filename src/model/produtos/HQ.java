package model.produtos;

/**
 * Classe que representa o produto HQ.
 */

public class HQ extends Produto {

    public HQ(int id, String nome, double preco, int estoque, String autor, String categoria) {
        super(id, nome, preco, estoque, autor, categoria);
    }

    public void exibirInfo() {
        System.out.println("HQ - " + getNome() + "  Preço: " + getPreco() + "  Estoque: " + getEstoque());
    }

}
