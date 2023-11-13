public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int estoque;
    private String autor;

    public Produto(int id, String nome, double preco, int estoque, String autor) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
