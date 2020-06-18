import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public int getSize() {
        return this.cards.size();
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void shuffleDeck(){
        Collections.shuffle(this.cards);
    }

    public void dealCard(Card card, Player player) {
        this.cards.remove(card);
        player.addCard(card);
    }


}
