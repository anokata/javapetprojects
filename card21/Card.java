class Card {
    public static void main(String[] args) {
        Card card = new Card(Rank.seven, Suit.spade);
        System.out.println(card);
    }

    // Масть
    private Suit suit;
    // Достоинство
    private Rank rank;

    Card (Rank r, Suit s) {
        this.suit = s;
        this.rank = r;
    }

    enum Suit { diamond, club, heart, spade};
    enum Rank { two, three, four, five, six, seven, eight, nine, ten, jack, queen, king, ace };

    public String toString() {
        return rank.toString() + " of " + suit.toString();
    }

    public Rank getRank() { return rank; }
    public Suit getSuit() { return suit; }
}

