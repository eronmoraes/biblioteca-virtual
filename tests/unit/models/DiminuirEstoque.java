import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@Test
public void DiminuirEstoque() {

  Livro livro1 = new Livro(1, "O Ladrão de raios", 47.68, 9, "Rick Riordan");

  Pedido pedido1 = new Pedido();

  pedido1.adicionarProduto(livro1);
  pedido1.calcularTotal();

  assertEquals(8,livro1.getEstoque());

}
