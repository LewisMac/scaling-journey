package blackjack;
import java.util.*;

public class Player{

  private String name;
  private PlayerHand hand;

  public Player(String name){
    this.name = name;
    this.hand = new PlayerHand();
  }

  public ArrayList returnCards(){
    ArrayList<Card> cards = new Arraylist<Card>();
    for (Card card : hand){
      cards.add(card);
    }
    return cards;
  }

}