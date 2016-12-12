package blackjack;

public class Deck{

  private Card[] deck;

  public Deck(){
    this.deck = new Card[52];
  }

  public void buildDeck(){
    int counter = 0;
    
    for(SuitValue suit: SuitValue.values()){
      int counter2 = 0;
      // System.out.println("Suit Change:" + suit);
      for(CardValue value: CardValue.values()){
        // System.out.println("Adding:" + value);
        deck[counter] = new Card(value, suit);
        counter ++;
      }
    }

  }

  public int deckCounter(){
    int cardCount = 0;

    for (Card card: deck){
      if (card != null){
        cardCount ++;
      }
    }
    return cardCount;
  }

  public Card removeCard(int position){
    Card card = deck[position];
    
    deck[position] = null;
    
    return card;
  }

}