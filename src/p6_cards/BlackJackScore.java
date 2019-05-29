package p6_cards;

public class BlackJackScore {

    private static final int MAX_SCORE = 21;

    public static int getScore(Player player) {
        int score = getHighScore(player);
        if (score <= MAX_SCORE) {
            return score;
        }
        return getLowScore(player);
    }

    private static int getLowScore(Player player) {
        int score = 0;
        for (Card card : player.getCards()) {
            score += getLowScore(card);
        }
        return score;

    }

    private static int getLowScore(Card card) {
        return getLowScore(card.getRank());
    }

    private static int getLowScore(Rank rank) {
        switch (rank) {
            case ACE:
                return 1;
            case TWO:
                return 2;
            case THREE:
                return 3;
            case FOUR:
                return 4;
            case FIVE:
                return 5;
            case SIX:
                return 6;
            case SEVEN:
                return 7;
            case EIGHT:
                return 8;
            case NINE:
                return 9;
            case TEN:
            case JACK:
            case QUEEN:
            case KING:
                return 10;
            default:
                return 0;
        }
    }

    private static int getHighScore(Player player) {
        int score = 0;
        for (Card card : player.getCards()) {
            score += getHighScore(card);
        }
        return score;
    }

    private static int getHighScore(Card card) {
        return getHighScore(card.getRank());
    }

    private static int getHighScore(Rank rank) {
        switch (rank) {
            case ACE:
                return 11;
            case TWO:
                return 2;
            case THREE:
                return 3;
            case FOUR:
                return 4;
            case FIVE:
                return 5;
            case SIX:
                return 6;
            case SEVEN:
                return 7;
            case EIGHT:
                return 8;
            case NINE:
                return 9;
            case TEN:
            case JACK:
            case QUEEN:
            case KING:
                return 10;
            default:
                return 0;
        }
    }
}
