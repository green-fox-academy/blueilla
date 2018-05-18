import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int x = 0;
        int y = 0;
        int lineGap = 20;
        int lineCount = WIDTH / lineGap;
        lineCount = Math.round(lineCount);

        for (int i = 0; i < lineCount; i++) {
            lineDraw(x, y, graphics);
            x += lineGap;
        }
        for (int i = 0; i < lineCount ; i++) {
            lineDraw(x, y, graphics);
            y += lineGap;
        }
       for (int i = 0; i < lineCount ; i++) {
            lineDraw(x, y, graphics);
            y = HEIGHT;
            x -= lineGap;
        }
        for (int i = 0; i < lineCount; i++) {
            lineDraw(x, y, graphics);
            y -= lineGap;
        }

    }

    public static void lineDraw(int x, int y, Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.drawLine(x, y, WIDTH/2, HEIGHT/2);
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
