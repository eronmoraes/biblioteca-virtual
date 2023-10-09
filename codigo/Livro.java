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
