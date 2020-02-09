class GameLogic {
    public static void main(String[] args) {
        GameLogic g = new GameLogic();
    }

    Deck deck;
    Deck playerHand;
    Deck dealerHand;

    GameLogic () {
        init();
    }

    public void init() {
        deck = new Deck();
        playerHand = new Deck();
        dealerHand = new Deck();
        deck.initDeck();
    }

    public void giveHand() {
        // take 2 cards
        for (int i = 0; i < 2; i++) {
            playerHand.addCard(deck.takeCard());
            dealerHand.addCard(deck.takeCard());
        }
    }
}

