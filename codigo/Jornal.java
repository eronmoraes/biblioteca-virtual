public class Jornal extends Produto {

    public Jornal(int id, String nome, double preco, int estoque, String categoria, String editora) {
        super(id, nome, preco, estoque, categoria, editora);
    }

    public void exibirInfo() {
        System.out.println("Jornal - Nome: " + getNome() + " Id: " + getId() + " Preço: " + getPreco() + " Estoque: " + getEstoque());
    }

}
