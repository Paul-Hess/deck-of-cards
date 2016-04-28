import org.junit.*;
import static org.junit.Assert.*;

public class CardTest {
    @Test
    public void card_initializesCorrectly_true() {
      Card testCard = new Card("Ace", "Spades");
      assertEquals(true, testCard instanceof Card);
    }

    @Test
    public void getSuit_returnsACardSuit_Spades() {
      Card testCard = new Card("Ace", "Spades");
      assertEquals("Spades", testCard.getSuit());
    }

    @Test
    public void getValue_returnsACardsValue() {
      Card testCard = new Card("Ace", "Spades");
      assertEquals("Ace", testCard.getValue());
    }

    @Test
    public void name_returnsAFormattedNameForCard_AceOfSpades() {
      Card testCard = new Card("Ace", "Spades");
      assertEquals("Ace of Spades", testCard.name());
    }
}
