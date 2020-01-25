class Deck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (Card c : deck.cards) System.out.println(c);
    }

    public final int DECK_SIZE = 52;

    public Card[] cards = new Card[DECK_SIZE];

    Deck () {
        int i = 0;
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                Card card = new Card(rank, suit);
                cards[i] = card;
                i++;
            }
        }
    }
}

