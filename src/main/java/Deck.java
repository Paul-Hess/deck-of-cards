import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  private static final String[] SUITS = {"Spades", "Clubs", "Hearts", "Diamonds" };
  private static final String[] VALUES = {
     "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
  };

  private ArrayList<Card> mCards;


  public Deck() {
    mCards = new ArrayList<Card>();
    for (String suit : SUITS){
      for (String value : VALUES){
        Card newCard = new Card(value, suit);
        mCards.add(newCard);
      }
    }
  }

  public ArrayList<Card> getCards() {
    return mCards;
  }

  public ArrayList<Card> shuffle() {
    Collections.shuffle(mCards);
    return mCards;
  }
}
