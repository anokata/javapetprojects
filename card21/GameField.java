import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.Image;
import java.awt.image.*;

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
        Graphics2D g2d = (Graphics2D)g;
        Color textColor = new Color(0,0,0);
        // draw deck
        // g.setColor(new Color(200, 200, 200));
        // g.fillRoundRect(deckX, deckY, deckWidth, deckHeigh, 20, 20);
        // g.setColor(new Color(150, 0, 0));
        // g.fillRoundRect(deckX+borderWidth/2, deckY+borderWidth/2, deckWidth-borderWidth, deckHeigh-borderWidth, 20, 20);

        // draw card (text)
        Font f = new Font("DejaVu Mono", Font.BOLD, 12);
        setFont(f);
        g.setColor(textColor);
        g2d.drawString("A", 100, 0);

        Image image;
        //image = Toolkit.getDefaultToolkit().getImage("cards/CA.png");
        //image = makeColorTransparent(image, Color.BLACK);

        //g2d.drawImage(image, 0, 0, this);
        //g2d.drawImage(gameLogic.deck.cards.get(0).getImage(), 0, 0, this);

        int handX = 10;
        int handY = 200;
        // draw player cards
        for (Card card : gameLogic.playerHand.cards) {
            g2d.drawImage(card.getImage(), handX, handY, this);
            //System.out.println(card);
            handX += 50;
        }

        // draw dealer hand backs
        handY = 20;
        for (Card card : gameLogic.dealerHand.cards) {
            g2d.drawImage(card.getImage(), handX, handY, this);
            //System.out.println(card);
            handX += 50;
        }
    }

    public static BufferedImage toBufferedImage(Image img) {
        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }
        int width = img.getWidth(null);
        if (width <= 0) width = 1;
        int height = img.getHeight(null);
        if (height <= 0) height = 1;
        // Create a buffered image with transparency
        BufferedImage bimage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        // Draw the image on to the buffered image
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();
        // Return the buffered image
        return bimage;
    }

    public static Image makeColorTransparent(Image image, final Color color) {
        BufferedImage im = toBufferedImage(image);
        ImageFilter filter = new RGBImageFilter() {
            // the color we are looking for... Alpha bits are set to opaque
            public int markerRGB = color.getRGB() | 0xFF000000;
            public final int filterRGB(int x, int y, int rgb) {
                if ((rgb | 0xFF000000) == markerRGB) {
                    // Mark the alpha bits as zero - transparent
                    return 0x00FFFFFF & rgb;
                } else {
                    // nothing to do
                    return rgb;
                }
            }
        };
        ImageProducer ip = new FilteredImageSource(im.getSource(), filter);
        return Toolkit.getDefaultToolkit().createImage(ip);
    }
}

