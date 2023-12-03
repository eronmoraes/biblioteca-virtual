public class Livro extends Produto {

    public Livro(int id, String nome, double preco, int estoque, String autor) {
        super(id, nome, preco, estoque, autor);
    }

    public void exibirInfo() {
        System.out.println("Livro - " + getNome() + "  Preço: " + getPreco() + "  Estoque: " + getEstoque());
    }

}
