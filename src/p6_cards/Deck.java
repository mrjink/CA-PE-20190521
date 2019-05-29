package p6_cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Deck {
    protected final List<Card> cards;

    public Deck() {
        this(1);
    }

    public Deck(int numberOfDecks) {
        cards = new ArrayList<>();
        restock(numberOfDecks);
    }

    protected void restock(int numberOfDecks) {
        for (int i = 0; i < numberOfDecks; i++) {
            for (Suit suit : Suit.values()) {
                for (Rank rank : getRanks()) {
                    cards.add(new Card(rank, suit));
                }
            }
        }
    }

    protected abstract Rank[] getRanks();

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void printDeck() {
        System.out.println(cards);
    }

    public Card takeOne() {
        return cards.remove(0);
    }

    public int remaining() {
        return cards.size();
    }
}
