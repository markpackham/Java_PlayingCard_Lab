import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;
    private SuitType[] suits = {
            SuitType.HEARTS,
            SuitType.DIAMONDS,
            SuitType.CLUBS,
            SuitType.DIAMONDS
    };
    private RankType[] ranks = {
            RankType.ACE,
            RankType.TWO,
            RankType.THREE,
            RankType.FOUR,
            RankType.FIVE,
            RankType.SIX,
            RankType.SEVEN,
            RankType.EIGHT,
            RankType.NINE,
            RankType.TEN,
            RankType.JACK,
            RankType.QUEEN,
            RankType.KING
    };


    public Deck(){
        this.cards = new ArrayList<Card>();
        for (int suits_index = 0; suits_index < 4; suits_index++){
            for (int rank_index = 0; rank_index < 13; rank_index++){
                this.cards.add(new Card(suits[suits_index], ranks[rank_index]));
            }
        }
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


}
