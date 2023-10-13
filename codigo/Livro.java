public class Livro extends Produto {
    private String autor;

    public Livro() {
        this.autor = "";
    }

    public Livro(int id, String nome, double preco, int estoque, String categoria, String editora, String autor) {
        super(id, nome, preco, estoque, categoria, editora);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirInfo() {
        System.out.println("Livro - Nome: " + getNome() + " Id: " + getId() + " Preço: " + getPreco() + " Estoque: " + getEstoque() + " Autor: " + autor);
    }
    
}
