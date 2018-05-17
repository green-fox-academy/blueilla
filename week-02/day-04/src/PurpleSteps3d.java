import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {

        int startX = 5;
        int startY = 5;
        int squareSize = 10;

        for (int i = 0; i < 20 ; i++) {
            purpleSteps(startX, startY, squareSize, graphics);
            startX += squareSize;
            startY += squareSize;
            squareSize += squareSize/2;


        }

    }

    public static void purpleSteps(int x, int y, int squareSize, Graphics graphics) {
        graphics.setColor(Color.pink);
        graphics.fillRect(x, y, squareSize, squareSize);
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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
