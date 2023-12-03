import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@Test
public void CriarProduto() {

  Livro livro1 = new Livro(1, "O Ladrão de raios", 47.68, 9, "Rick Riordan");

  assertEquals(1,livro1.getId());
  assertEquals("O Ladrão de raios",livro1.getNome());
  assertEquals(47.68,livro1.getPreco(), 0.001);
  assertEquals(9,livro1.getEstoque());
  assertEquals("Rick Riordan",livro1.getAutor());

}
