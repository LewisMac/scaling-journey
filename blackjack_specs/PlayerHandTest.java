import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class PlayerHandTest{

  private PlayerHand hand;
  private Deck deck;

  @Before
  public void Before(){
    hand = new PlayerHand();
    deck = new Deck();
    deck.buildDeck();
  }

  @Test
  public void startsWithNoCards(){
    assertEquals(0, hand.handCounter());
  }

  @Test
  public void canGetCard(){
    Card card = new Card(CardValue.ONE, SuitValue.HEART);
    hand.addCard(card);
    assertEquals(1, hand.handCounter());
  }

  @Test
  public void canGetCardFromDeck(){
    hand.addCard(deck.removeCard(0));
    assertEquals(1, hand.handCounter());
  }

  @Test
  public void getsCorrectCardFromDeck(){
    Card removedCard = deck.removeCard(4);
    System.out.println(removedCard.getValue());
    System.out.println(removedCard.getSuit());
    hand.addCard(removedCard);
    Card selectedCard = hand.selectCard(0);
    System.out.println(selectedCard.getValue());
    System.out.println(selectedCard.getSuit());
    assertEquals(1, hand.handCounter());
  }

  

}