import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class CardTest{

  Card card;

  @Before
  public void before(){
    card = new Card(CardValue.TWO, SuitValue.HEART);
  }

  @Test
  public void hasValue(){
    assertEquals(CardValue.TWO, card.getValue());
  }

  @Test
  public void hasSuit(){
    assertEquals(SuitValue.HEART, card.getSuit());
  }
}