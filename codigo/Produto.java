public class Produto {
    private int idProduto;
    private String nome;
    private String descricao;
    private double preco;
    private int estoque;
    private String categoria;
    private String editora;

    public Produto() {
        this.idProduto = 0;
        this.nome = "";
        this.descricao = "";
        this.preco = 0;
        this.estoque = 0;
        this.categoria = "";
        this.editora = "";
    }

    public Produto(int idProduto, String nome, String descricao, double preco, int estoque, String categoria, String editora) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
        this.categoria = categoria;
        this.editora = editora;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public void exibirInfo(){
        System.out.println("Nome :" + nome);
        System.out.println("idProduto :" + idProduto);
    }


    public class Livro extends Produto {
        private String autor;

        public Livro() {
            this.autor = "";
        }

        public Livro(int idProduto, String nome, String descricao, double preco, int estoque, String categoria, String editora, String autor) {
            super(idProduto, nome, descricao, preco, estoque, categoria, editora);
            this.autor = autor;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }
    }

    public class Revista extends Produto {
        
        public Revista(int idProduto, String nome, String descricao, double preco, int estoque, String categoria, String editora) {
            super(idProduto, nome, descricao, preco, estoque, categoria, editora);
        }

    }

    public class historiaEmQuadrinhos extends Produto {
        private String autor;

        public historiaEmQuadrinhos() {
            this.autor = "";
        }

        public historiaEmQuadrinhos(int idProduto, String nome, String descricao, double preco, int estoque, String categoria, String editora, String autor) {
            super(idProduto , nome, descricao, preco, estoque, categoria, editora);
            this.autor = autor;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }
    }

    public class Jornal extends Produto {

        public Jornal(int idProduto, String nome, String descricao, double preco, int estoque, String categoria, String editora) {
            super(idProduto, nome, descricao, preco, estoque, categoria, editora);
        }

    }

    public class Manga extends Produto {
        private String autor;

        public Manga() {
            this.autor = "";
        }

        public Manga(int idProduto, String nome, String descricao, double preco, int estoque, String categoria, String editora, String autor) {
            super(idProduto, nome, descricao, preco, estoque, categoria, editora);
            this.autor = autor;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

    }

    public class Curso extends Produto {
        private String autor;

        public Curso() {
            this.autor = "";
        }

        public Curso(int idProduto, String nome, String descricao, double preco, int estoque, String categoria, String editora, String autor) {
            super(idProduto, nome, descricao, preco, estoque, categoria, editora);
            this.autor = autor;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }
    }
}
