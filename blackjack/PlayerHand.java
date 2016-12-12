package blackjack;
import java.util.*;

public class PlayerHand{

  private ArrayList<Card> hand;

  public PlayerHand(){
    this.hand = new ArrayList<Card>();
  }

  public void addCard(Card card){
    hand.add(card);
  }

  public void removeCards(){
    hand.clear();
  }

  public int handCounter(){
    return hand.size();
  }

  public Card selectCard(int position){
    Card card = hand.get(position);
    return card;
  }

}