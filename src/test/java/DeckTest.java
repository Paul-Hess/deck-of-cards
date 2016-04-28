import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;


public class DeckTest {
  @Test
  public void deck_initializesCorrectly() {
    Deck testDeck = new Deck();
    assertEquals(true, testDeck instanceof Deck);
  }

  @Test
  public void getCards_initializesWithCardsList_true() {
    Deck testDeck = new Deck();
    assertEquals(true, testDeck.getCards() instanceof ArrayList);
  }

  @Test
  public void getCards_initializesWith52Cards_52() {
    Deck testDeck = new Deck();
    assertEquals(52, testDeck.getCards().size());
  }

  @Test
  public void getCards_cardsAreInitializedWithSuitsAndValues_AceOfSpades() {
    Deck testDeck = new Deck();
    Card aceOfSpades = testDeck.getCards().get(0);
    assertEquals("Ace of Spades", aceOfSpades.name());
  }

  @Test
  public void getCards_deckContains52UniqueCards_kingOfDiamonds() {
    Deck testDeck = new Deck();
    Card kingOfDiamonds = testDeck.getCards().get(51);
    assertEquals("King of Diamonds", kingOfDiamonds.name());
  }

  @Test
  public void getCards_ShuffleDeckofCards() {
    Deck testDeck = new Deck();
    testDeck.shuffle();
    Card aceOfSpades = testDeck.getCards().get(0);
    assertEquals("Ace of Spades", aceOfSpades.name());
  }
}
