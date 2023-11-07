import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@Test
public void () {

  Livro livro1 = new Livro(1, "O Ladrão de raios", 47.68, 9, "Rick Riordan");

  assertEquals("O Ladrão de raios",livro1.getNome());

}
