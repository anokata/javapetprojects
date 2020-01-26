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
        g.setColor(Color.white);
        g.fillRect(0,0,500,250);
        g.setColor(Color.blue);
        g.fillRect(10,10,200,250);
    }
}

