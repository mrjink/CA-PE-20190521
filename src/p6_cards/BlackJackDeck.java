package p6_cards;

public class BlackJackDeck extends Deck {

    public BlackJackDeck() {
        super();
    }

    public BlackJackDeck(int numberOfDecks) {
        super(numberOfDecks);
    }

    protected Rank[] getRanks() {
        return Rank.values();
    }

}
