import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int startingPoint1 = 0;
        int startingPoint2 = 0;

        int endPoint1 = WIDTH;
        int endPoint2 = 10;
        int lineCount = 15;

        for (int i = 0; i < lineCount ; i++) {
            drawLine(startingPoint1, startingPoint2, endPoint1, endPoint2, Color.magenta, graphics);
            startingPoint1 += startingPoint1;
            endPoint2 += endPoint2;

        }
    }




    public static void drawLine(int x1, int y1, int x2, int y2, Color color, Graphics graphics) {
        graphics.setColor(color);
        graphics.drawLine(x1, y1, x2, y2);
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
