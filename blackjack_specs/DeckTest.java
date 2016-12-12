import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class DeckTest{

  private Deck deck;

  @Before
  public void before(){
    deck = new Deck();
    deck.buildDeck();
  }

  @Test
  public void createdDeck(){
    assertEquals(52, deck.deckCounter());
  }

  @Test
  public void getCardFromDeck(){
    Card card = new Card(CardValue.ONE, SuitValue.HEART);
    Card cardDeck = deck.removeCard(0);

    System.out.println(card.getValue());
    System.out.println(card.getSuit());
    System.out.println(cardDeck.getValue());
    System.out.println(cardDeck.getSuit());

    assertEquals(51, deck.deckCounter());
  }

}