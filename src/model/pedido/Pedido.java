package model.pedido;

import model.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa o model.model.produtos.pedido do model.model.produtos.cliente.
 * @return Retorna o total dos model.model.produtos adicionados ao model.model.produtos.pedido.
 */

public class Pedido {
  private List<Produto> produtos = new ArrayList<>();

  public void adicionarProduto(Produto produto) {
      produtos.add(produto);
  }

  public void removerProduto(Produto produto) {
      produtos.remove(produto);
  }

  public List<Produto> getProdutos() {
      return produtos;
  }

    public String calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            if (produto.getEstoque() > 0) {
                total += produto.getPreco();
                produto.setEstoque(produto.getEstoque() - 1);
            } else {
                System.out.println(produto.getNome() + " sem estoque!");
            }
        }
        return String.format("%.2f", total);
    }

}
