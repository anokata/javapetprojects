import java.util.*;

class Deck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.initDeck();
        for (Card c : deck.cards) System.out.println(c);
    }

    public final int DECK_SIZE = 52;

    public Stack<Card> cards = new Stack<Card>();

    public void initDeck() {
        int i = 0;
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                Card card = new Card(rank, suit);
                cards.push(card);
                i++;
            }
        }
    }

    public Card takeCard() {
        return cards.pop();
    }

    public void addCard(Card card) {
        cards.push(card);
    }

    Deck () {
    }
}

