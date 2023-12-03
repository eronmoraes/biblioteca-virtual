import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@Test
public void CadastrarCliente() {

  Cliente cliente1 = new Cliente("Bruno", 123, "bruno@gmail.com");

  assertEquals("Bruno",cliente1.getNome());
  assertEquals(123,cliente1.getCpf());
  assertEquals("bruno@gmail.com",cliente1.getEmail());

}
