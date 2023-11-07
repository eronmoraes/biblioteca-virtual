import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@Test
public void () {

  Cliente cliente1 = new Cliente("Bruno", 123, "00/00/0000");

  assertEquals("Bruno",cliente1.getNome());
  assertEquals(123,cliente1.getCpf());
  assertEquals("00/00/0000",cliente1.getDataNasc());

}
