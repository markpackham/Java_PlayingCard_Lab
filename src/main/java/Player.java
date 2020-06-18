import java.util.ArrayList;

public class Player {
    private String name;
    private Card card;

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public Card getCard(){
        return this.card;
    }

    public Card addCard(Card card){
        return this.card = card;
    }


}
