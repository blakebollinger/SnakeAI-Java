import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {

    // Defining parameters for our display,
    public Display() {
        super("Snake Graphics");

        setSize(750, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // Does all initial drawing for game
    public void drawGame(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        // Initializes text font
        Font font = new Font("Helvetica", Font.PLAIN, 12);

        g2d.setFont(font);

        // Border
        g2d.drawRect(20, 90, 710, 690);

        // Title
        String title = "Welcome to SnakeAI";
        g2d.drawString(title, (750 - getFontMetrics(font).stringWidth(title)) / 2, 45);

        // Score
        g2d.drawString("Score: ", 20, 80);

    }

    // Don't touch meeee
    @Override
    public void paint(Graphics g) {

        super.paint(g);

        drawGame(g);

    }
}
