package model.produtos;

/**
 * Classe que representa o produto Curso.
 */

public class Curso extends Produto {

    public Curso(int id, String nome, double preco, int estoque, String autor) {
        super(id, nome, preco, estoque, autor);
    }

    public void exibirInfo() {
        System.out.println("Curso - " + getNome() + "  Preço: " + getPreco() + "  Estoque: " + getEstoque());
    }

}
