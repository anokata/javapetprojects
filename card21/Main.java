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
    JPanel mainPanel;

    GameLogic gl;

    Deck deck;

    Main () {
        frame = new JFrame("21 Point");
        mainPanel = new JPanel();
        
        frame.getContentPane().add(mainPanel);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //deck = new Deck();
        gl = new GameLogic();
        // buttons to intreact with gl
    }
}

