import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

class GameField extends JPanel {
    public static void main(String[] args) {
        GameField app = new GameField(new GameLogic());
    }

    GameLogic gameLogic;

    GameField (GameLogic gl) {
        gameLogic = gl;
    }

    public void paintComponent(Graphics g) {
        int deckX = 20;
        int deckY = 20;
        int deckWidth = 50;
        int deckHeigh = 80;
        int borderWidth = 10;
        Color textColor = new Color(0,0,0);
        // draw deck
        g.setColor(new Color(200, 200, 200));
        g.fillRoundRect(deckX, deckY, deckWidth, deckHeigh, 20, 20);
        g.setColor(new Color(150, 0, 0));
        g.fillRoundRect(deckX+borderWidth/2, deckY+borderWidth/2, deckWidth-borderWidth, deckHeigh-borderWidth, 20, 20);

        // draw card (text)
        Font f = new Font("DejaVu Mono", Font.BOLD, 12);
        setFont(f);
        g.setColor(textColor);
        g.drawString("A", 0, 0);
    }
}

