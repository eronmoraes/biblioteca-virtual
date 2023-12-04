import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa o pedido do cliente.
 * @return Retorna o total dos produtos adicionados ao pedido.
 */

class Pedido {
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
          total += produto.getPreco();
          produto.setEstoque(produto.getEstoque() - 1);
      }
      String totalFormatado = String.format("%.2f", total);
      return totalFormatado;
  }

}
