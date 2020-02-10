import java.awt.Image;
import java.awt.*;

class Card {
    public static void main(String[] args) {
        Card card = new Card(Rank.seven, Suit.spade);
        System.out.println(card);
    }

    private Image image;

    // Масть
    private Suit suit;
    // Достоинство
    private Rank rank;

    Card (Rank r, Suit s) {
        this.suit = s;
        this.rank = r;
        loadCard();
    }

    Card (Suit s, Rank r) {
        this(r, s);
    }
    
    private void loadCard() {
        String cardName = getCardName();
        String path = "cards/" + cardName + ".png";
        image = Toolkit.getDefaultToolkit().getImage(path);
        //System.out.println("load " + path);
    }

    public Image getImage() { return image; }

    public String getCardName() {
        String name = "";
        name += suit.toString().toUpperCase().charAt(0);
        if (rank.ordinal() > Rank.ten.ordinal()) {
            name += rank.toString().toUpperCase().charAt(0);
        } else {
            name += Integer.toString(rank.ordinal() + 2);
        }

        return name;
    }

    public enum Suit { diamond, club, heart, spade};
    public enum Rank { two, three, four, five, six, seven, eight, nine, ten, jack, queen, king, ace };

    public String toString() {
        return rank.toString() + " of " + suit.toString() + " (" + getCardName() + ")";
    }

    public Rank getRank() { return rank; }
    public Suit getSuit() { return suit; }
}

