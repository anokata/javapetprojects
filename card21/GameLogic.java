class GameLogic {
    public static void main(String[] args) {
        GameLogic g = new GameLogic();
    }

    Deck deck;
    Deck playerHand;
    Deck dealerHand;

    GameLogic () {
        deck = new Deck();
        playerHand = new Deck();
        dealerHand = new Deck();
        deck.initDeck();
    }
}

