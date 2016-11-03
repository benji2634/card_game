import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class CardTest {

  Card card;

  @Before 
  public void before() {
    card = new Card(ValueType.ACE, SuitType.SPADE);
  }

  @Test
  public void canGetValueType() {
    assertEquals(ValueType.ACE, card.getValue());
  }

  @Test
  public void canGetSuitType() {
    assertEquals(SuitType.SPADE, card.getSuit());
  }
}