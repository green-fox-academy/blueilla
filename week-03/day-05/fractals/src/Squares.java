import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
    public static void mainDraw(Graphics graphics){

        int squareX = 0;
        int squareY = 0;

        drawSquares(squareX, squareY, HEIGHT, graphics);
    }
    public static void drawSquares(int x, int y, int size, Graphics graphics) {
        graphics.drawRect(x + size / 3, y, size / 3, size / 3);
        graphics.drawRect(x, y + size / 3, size / 3, size / 3);
        graphics.drawRect(x + size / 3, y + size / 3 * 2, size / 3, size / 3);
        graphics.drawRect(x + size / 3 * 2, y + size / 3, size / 3, size / 3);
        if (size > 15) {
            drawSquares(x + size / 3, y, size / 3, graphics);
            drawSquares(x, y + size / 3, size / 3, graphics);
            drawSquares(x + size / 3, y + size / 3 * 2, size / 3, graphics);
            drawSquares(x + size / 3 * 2, y+ size / 3, size / 3, graphics);
        }
    }





    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
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