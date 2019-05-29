package p6_cards;

import java.util.ArrayList;
import java.util.List;

public class BlackJack {

    public static final int NUMBER_OF_PLAYERS = 4;

    public static void main(String[] args) {
        Deck deck = new BlackJackDeck(2);
        deck.printDeck();
        deck.shuffle();
        deck.printDeck();
        System.out.println(deck.remaining());

        List<Player> players = new ArrayList<>();

        for (int i = 1; i <= NUMBER_OF_PLAYERS; i++) {
            players.add(new Player("Player " + i));
        }
        players.add(new Player("Bank"));

        for (int i = 0; i < 2; i++) {
            for (Player player : players) {
                player.addCard(deck.takeOne());
            }
        }

        deck.printDeck();
        printPlayers(players);

        for (Player player : players) {
            while (BlackJackScore.getScore(player) < 17) {
                player.addCard(deck.takeOne());
            }
        }

        printPlayers(players);
    }

    private static void printPlayers(List<Player> players) {
        for (Player player : players) {
            int score = BlackJackScore.getScore(player);
            System.out.format("%s: %s score: %d%s%n",
                player.getName(), player.printCards(),
                score, score > 21 ? " BUST!" : "");
        }
        System.out.println();
    }
}
