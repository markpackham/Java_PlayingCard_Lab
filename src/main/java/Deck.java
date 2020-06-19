import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;
it
    public Deck(){
        this.cards = new ArrayList<Card>();
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                this.cards.add(new Card(suit, rank));
            }
        }

//        for (int suits_index = 0; suits_index < 4; suits_index++){
//            for (int rank_index = 0; rank_index < 13; rank_index++){
//                this.cards.add(new Card(suits[suits_index], ranks[rank_index]));
//            }
//        }
    }

    public int getSize() {
        return this.cards.size();
    }

    public ArrayList<Card> getCards(){
        System.out.println(this.cards.size());
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


    public Card getTopCard() {
        return this.cards.get(0);
    }
}
