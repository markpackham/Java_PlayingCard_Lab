import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
    private Boolean gameOver = false;
    private ArrayList<Integer> scores = new ArrayList<>();
    private String result = "";

    public Game(Deck deck, ArrayList<Player> players){
        this.deck = deck;
        this.players = players;
    }

    public void playGame() {
        while (!gameOver) {
            deck.shuffleDeck();
            this.dealCards();
            players.forEach((player) -> {
                System.out.println(player);
                System.out.println(player.getCard().getValueFromRankEnum());

                 scores.add(player.getCard().getValueFromRankEnum());
            });

            gameOver = true;


        }
    }

    public String getResult(){
        if(scores.get(0) > scores.get(1))
        {
            return "Player One wins";
        }
        if (scores.get(0) < scores.get(1))
        {
            return "Player Two wins";
        }
        else{
            return "Draw";
        }
    }


    public void dealCards(){
        for (Player player : players){
            deck.dealCard(deck.getTopCard(), player);
        }
    }

}
