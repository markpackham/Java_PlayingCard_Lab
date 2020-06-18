import org.junit.Before;

public class PlayerTest {

    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Deck deck1;
    Deck deck2;

    @Before
    public void before(){
        player1 = new Player("John");
        player2 = new Player("Paul");
        player3 = new Player("George");
        player4 = new Player("Ringo");
    }

}
