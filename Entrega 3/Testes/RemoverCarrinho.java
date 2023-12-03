import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@Test
public void RemoverCarrinho() {
  
  Livro livro1 = new Livro(1, "O Ladrão de raios", 47.68, 9, "Rick Riordan");
  Livro livro2 = new Livro(2, "O Hobbit", 50.90, 8, "J.R.R. Tolkien");

  Carrinho carrinho1 = new Carrinho();

  carrinho1.adicionarProduto(livro1);
  carrinho1.adicionarProduto(livro2);

  carrinho1.removerProduto(livro1);

  assertEquals(1,carrinho1.getItens().size());
}
