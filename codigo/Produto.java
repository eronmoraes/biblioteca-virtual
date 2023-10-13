public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int estoque;
    private String categoria;
    private String editora;

    public Produto() {
        this.id = 0;
        this.nome = "";
        this.preco = 0;
        this.estoque = 0;
        this.categoria = "";
        this.editora = "";
    }

    public Produto(int id, String nome, double preco, int estoque, String categoria, String editora) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.categoria = categoria;
        this.editora = editora;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void exibirInfo() {
        System.out.println("Produto - Nome: " + nome + " Id: " + id + " Preço: " + preco + " Estoque: " + estoque);
    }

}
