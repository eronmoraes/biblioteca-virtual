import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@Test
public void EditarProduto() {

  Livro livro1 = new Livro(1, "O Ladrão de raios", 47.68, 9, "Rick Riordan");

  livro1.setPreco(39.99);

  assertEquals(39.99, livro1.getPreco(), 0.001);

}
