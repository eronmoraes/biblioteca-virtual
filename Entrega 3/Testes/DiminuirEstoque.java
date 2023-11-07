import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@Test
public void () {

  Livro livro1 = new Livro(1, "O Ladrão de raios", 47.68, 9, "Rick Riordan");

  Cliente cliente1 = new Cliente("Bruno", 123, "bruno@gmail.com");
  Pedido pedido1 = new Pedido(1, cliente1);

  pedido1.adicionarProduto(livro1);
  pedido1.calcularTotal();

  assertEquals(8,livro1.getEstoque());

}
