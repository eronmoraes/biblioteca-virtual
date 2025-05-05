package src.model;

import model.produtos.Produto;

public class Livro extends Produto {

    public Livro(int id, String nome, double preco, int estoque, String autor, String categoria) {
        super(id, nome, preco, estoque, autor, categoria);
    }
}
