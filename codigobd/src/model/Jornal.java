package src.model;

import model.produtos.Produto;

public class Jornal extends Produto {

    public Jornal(int id, String nome, double preco, int estoque, String autor, String categoria) {
        super(id, nome, preco, estoque, autor, categoria);
    }
}
