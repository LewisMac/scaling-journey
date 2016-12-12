package blackjack;

public class Card{

  private CardValue value;
  private SuitValue suit;

  public Card(CardValue value, SuitValue suit){

    this.value = value;
    this.suit = suit;

  }

  public CardValue getValue(){
    return this.value;
  }

  public SuitValue getSuit(){
    return this.suit;
  }
}
