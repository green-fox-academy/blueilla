
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int x = 0;
        int y = 0;
        int squareSize = 50;

        for (int i = 0; i < 8 ; i++) {

            for (int j = 0; j < 8; j++) {
                drawSquare(x, y, squareSize, graphics);

                if (j % 2 == i % 2) {
                    fillSquare(x, y, squareSize, graphics);
                } 
                x += squareSize;

            }
            x = 0;
            y += squareSize;
        }
    }

    public static void drawSquare(int x, int y, int squareSize, Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.drawRect(x, y, squareSize, squareSize);
    }
    public static void fillSquare(int x, int y, int squareSize, Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillRect(x, y, squareSize, squareSize);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
