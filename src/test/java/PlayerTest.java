import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Deck deck1;
    Deck deck2;
    Card card1;
    Card card2;
    Card card3;
    Card card4;

    @Before
    public void before(){
        player1 = new Player("John");
        player2 = new Player("Paul");
        player3 = new Player("George");
        player4 = new Player("Ringo");
        card1 = new Card(SuitType.HEARTS, RankType.QUEEN);
        card2 = new Card(SuitType.SPADES, RankType.ACE);
        card3 = new Card(SuitType.SPADES, RankType.KING);
        card4 = new Card(SuitType.DIAMONDS, RankType.TWO);
    }

    @Test
    public void canDrawCard(){
        assertEquals(card1, player1.addCard(card1));
    }

    @Test
    public void canGetName(){
        assertEquals("John", player1.getName());
    }



}
