import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        Deck deck = new Deck();

        ArrayList<Player> players = new ArrayList<Player>();
        Player player1 = new Player("John");
        Player player2 = new Player("Paul");
//        Player player3 = new Player("George");
//        Player player4  = new Player("Ringo");

        players.add(player1);
        players.add(player2);
//        players.add(player3);
//        players.add(player4);

        Game game = new Game(deck, players);

        game.playGame();

        System.out.println(game.getResult());

    }




}
