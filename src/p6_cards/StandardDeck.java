package p6_cards;

public class StandardDeck extends Deck {
    public StandardDeck() {
    }

    public StandardDeck(int numberOfDecks) {
        super(numberOfDecks);
    }

    @Override
    protected Rank[] getRanks() {
        return Rank.values();
    }
}
