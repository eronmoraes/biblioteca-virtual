import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@Test
public void EditarCliente() {

  Cliente cliente1 = new Cliente("Bruno", 123, "bruno@gmail.com");

  cliente1.setNome("Vinicius");
  
  assertEquals("Vinicius",cliente1.getNome());

}
