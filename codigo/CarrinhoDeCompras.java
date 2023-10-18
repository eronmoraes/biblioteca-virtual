import java.util.ArrayList;
import java.util.List;

class CarrinhoDeCompras {
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
