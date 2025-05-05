package src.model;

import model.produtos.Produto;

public class Manga extends Produto {
   
    public Manga(int id, String nome, double preco, int estoque, String autor, String categoria) {
        super(id, nome, preco, estoque, autor, categoria);
    }
}
