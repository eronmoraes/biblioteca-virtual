/**
 * Classe que representa o produto Revista.
 */

public class Revista extends Produto {

    public Revista(int id, String nome, double preco, int estoque, String autor) {
        super(id, nome, preco, estoque, autor);
    }

    public void exibirInfo() {
        System.out.println("Revista - " + getNome() + "  Preço: " + getPreco() + "  Estoque: " + getEstoque());
    }

}
