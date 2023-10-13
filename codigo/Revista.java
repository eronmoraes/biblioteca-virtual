public class Revista extends Produto {

    public Revista(int id, String nome, double preco, int estoque, String categoria, String editora) {
        super(id, nome, preco, estoque, categoria, editora);
    }

    public void exibirInfo() {
        System.out.println("Revista - Nome: " + getNome() + " Id: " + getId() + " Preço: " + getPreco() + " Estoque: " + getEstoque());
    }

}
