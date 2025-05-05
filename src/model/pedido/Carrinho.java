package model.pedido;

import model.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa o carrinho do model.model.produtos.cliente.
 * @return Retorna os itens do carrinho do model.model.produtos.cliente.
 */

public class Carrinho {
  private List<Produto> itens = new ArrayList<>();

  public void adicionarProduto(Produto produto) {
      itens.add(produto);
  }

  public void removerProduto(Produto produto) {
      itens.remove(produto);
  }

  public List<Produto> getItens() {
      return itens;
  }

}
