import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {
    Deck deck1;
    Deck deck2;
    Card card1;
    Card card2;
    Card card3;
    Card card4;

    @Before
    public void before(){
        deck1 = new Deck();
        deck2 = new Deck();
        card1 = new Card(SuitType.HEARTS, RankType.QUEEN);
        card2 = new Card(SuitType.SPADES, RankType.ACE);
        card3 = new Card(SuitType.SPADES, RankType.KING);
        card4 = new Card(SuitType.DIAMONDS, RankType.TWO);
    }

    @Test
    public void deckStartsAt0(){
        assertEquals(0, deck1.getSize());
    }

    @Test
    public void canAddCard(){
        deck1.addCard(card1);
        assertEquals(1, deck1.getSize() );
    }

    @Test
    public void canGetDeck__Unshuffled(){
        ArrayList<Card> expected = new ArrayList<>();
        expected.add(card1);
        expected.add(card2);
        expected.add(card3);
        expected.add(card4);

        deck1.addCard(card1);
        deck1.addCard(card2);
        deck1.addCard(card3);
        deck1.addCard(card4);

        assertEquals(expected, deck1.getCards());
    }

    @Test
    public void canGetDeck__Shuffled(){
        ArrayList<Card> expected = new ArrayList<>();
        expected.add(card1);
        expected.add(card2);
        expected.add(card3);
        expected.add(card4);

        deck1.addCard(card1);
        deck1.addCard(card2);
        deck1.addCard(card3);
        deck1.addCard(card4);

        deck1.shuffleDeck();

        assertNotEquals(expected, deck1.getCards());
    }

    @Test
    public void canDealCard(){
        deck1.addCard(card1);
        deck1.addCard(card2);
        deck1.addCard(card3);

        deck1.dealCard(card1);

        assertEquals(2, deck1.getSize());
    }

}
