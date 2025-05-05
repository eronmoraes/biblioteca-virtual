package model.produtos;

/**
 * Classe que representa o produto Jornal.
 */

public class Jornal extends Produto {

    public Jornal(int id, String nome, double preco, int estoque, String autor, String categoria) {
        super(id, nome, preco, estoque, autor, categoria);
    }

    public void exibirInfo() {
        System.out.println("Jornal - " + getNome() + "  Preço: " + getPreco() + "  Estoque: " + getEstoque() + "\n");
    }

}
