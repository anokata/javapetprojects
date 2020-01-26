import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Main app = new Main();
    }

    JFrame frame;

    GameLogic gameLogic;
    GameField gameField;

    Main () {
        frame = new JFrame("21 Point");
        
        gameLogic = new GameLogic();
        gameField = new GameField(gameLogic);
        frame.getContentPane().add(gameField);

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

