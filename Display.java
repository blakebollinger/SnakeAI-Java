import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {

    private int displayWidth = 730;
    private int displayHeight = 800;

    // Defining parameters for our display,
    public Display() {
        super("Snake Graphics");

        setSize(displayWidth, displayHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // Does all initial drawing for game
    public void drawGame(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        initBoard(g2d);

        Snake.initSnake(g2d);

    }

    public void initBoard(Graphics2D g2d) {

        // Initializes text font
        Font font = new Font("Helvetica", Font.PLAIN, 12);

        g2d.setFont(font);

        // Draw Grid
        g2d.setColor(Color.lightGray);
        for (int i = 50; i <= 690; i += 30) {
            g2d.drawLine(i, 90, i, 780);
        }
        for (int i = 90; i <= 780; i += 30) {
            g2d.drawLine(20, i, 710, i);
        }
        g2d.setColor(Color.black);

        // Border
        g2d.drawRect(20, 90, 690, 690);

        // Title
        String title = "Welcome to SnakeAI";
        g2d.drawString(title, (displayWidth - getFontMetrics(font).stringWidth(title)) / 2, 45);

        // Score
        g2d.drawString("Score: ", 20, 80);

    }

    // Don't touch meeee
    @Override
    public void paint(Graphics g) {

        super.paint(g);

        drawGame(g);

    }

    public int getDisplayHeight() {
        return displayHeight;
    }

    public int getDisplayWidth() {
        return displayWidth;
    }
}
