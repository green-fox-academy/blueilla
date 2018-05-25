import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
    public static void mainDraw(Graphics graphics){
      int size = WIDTH;
      int basicX = 0;
      int basicY = 0;
      drawSquare(basicX, basicY, size, graphics);
      drawFourSquares(basicX, WIDTH / 3, HEIGHT / 3, graphics);

    }
    public static void drawSquare(int x, int y, int size, Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.drawRect(x, y, size, size);
    }

    public static void drawFourSquares(int x, int y, int size, Graphics graphics) {
        for (int i = 0; i < 2 ; i++) {
            graphics.setColor(Color.black);
            graphics.drawRect(x, y, size, size);
            x += WIDTH / 3;
            y -= WIDTH / 3;

        }
    }

    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

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