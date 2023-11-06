import java.util.ArrayList;
import java.util.List;

class Pedido {
  private int idPedido;
  private Cliente cliente;
  private List<Produto> produtos = new ArrayList<>();

  public Pedido(int idPedido, Cliente cliente) {
      this.idPedido = idPedido;
      this.cliente = cliente;
  }

  public void adicionarProduto(Produto produto) {
      produtos.add(produto);
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
