public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidadeEmEstoque;
    private String categoria;

    public Produto(int id, String nome, String descricao, double preco, int quantidadeEmEstoque, String categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.categoria = categoria;
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

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public class Livro extends Produto {
        private String editora;
        private String autor;

        public Livro(int id, String nome, String descricao, double preco, int quantidadeEmEstoque, String categoria) {
            super(id, nome, descricao, preco, quantidadeEmEstoque, categoria);
            this.editora = editora;
            this.autor = autor;
        }

        public String getEditora() {
            return editora;
        }

        public void setEditora(String editora) {
            this.editora = editora;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }
    }

    public class Revista extends Produto {
        private String editora;

        public Revista(int id, String nome, String descricao, double preco, int quantidadeEmEstoque, String categoria) {
            super(id, nome, descricao, preco, quantidadeEmEstoque, categoria);
            this.editora = editora;
        }

        public String getEditora() {
            return editora;
        }

        public void setEditora(String editora) {
            this.editora = editora;
        }
    }

    public class historiaEmQuadrinhos extends Produto {
        private String editora;
        private String autor;

        public historiaEmQuadrinhos(int id, String nome, String descricao, double preco, int quantidadeEmEstoque, String categoria) {
            super(id, nome, descricao, preco, quantidadeEmEstoque, categoria);
            this.editora = editora;
            this.autor = autor;
        }

        public String getEditora() {
            return editora;
        }

        public void setEditora(String editora) {
            this.editora = editora;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }
    }

    public class Jornal extends Produto {
        private String editora;

        public Jornal(int id, String nome, String descricao, double preco, int quantidadeEmEstoque, String categoria) {
            super(id, nome, descricao, preco, quantidadeEmEstoque, categoria);
            this.editora = editora;
        }

        public String getEditora() {
            return editora;
        }

        public void setEditora(String editora) {
            this.editora = editora;
        }
    }

    public class Manga extends Produto {
        private String editora;

        public Manga(int id, String nome, String descricao, double preco, int quantidadeEmEstoque, String categoria) {
            super(id, nome, descricao, preco, quantidadeEmEstoque, categoria);
            this.editora = editora;
        }

        public String getEditora() {
            return editora;
        }

        public void setEditora(String editora) {
            this.editora = editora;
        }
    }

    public class Curso extends Produto {
        private String autor;

        public Curso(int id, String nome, String descricao, double preco, int quantidadeEmEstoque, String categoria) {
            super(id, nome, descricao, preco, quantidadeEmEstoque, categoria);
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
