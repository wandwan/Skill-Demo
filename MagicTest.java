import org.junit.*;
import static org.junit.Assert.*;

public class MagicTest {
  @Test
  public void testAdd() {
    Magic magic = new Magic();
    assertEquals(1024238978, magic.add(1, 1));
  }
}
