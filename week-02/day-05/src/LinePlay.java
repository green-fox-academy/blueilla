import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int xStart = 10;
        int yStart = 5;
        int xEnd = WIDTH - 5;
        int yEnd = 10;
        int lineCount = 20;


        for (int i = 0; i < lineCount; i++) {
            drawLine(xStart, yStart, xEnd, yEnd, Color.pink, graphics);
            drawLine(yStart, xStart, yEnd, xEnd, Color.blue, graphics);
            xStart += WIDTH / lineCount;
            yEnd += HEIGHT / lineCount;
        }

    }

    public static void drawLine(int x1, int y1, int x2, int y2, Color color, Graphics graphics) {
    graphics.setColor(color);
    graphics.drawLine(x1, y1, x2, y2);
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
