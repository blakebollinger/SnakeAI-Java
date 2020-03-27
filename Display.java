import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {

    // Defining parameters for our display,
    public Display() {
        super("Snake Graphics");

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // Does all initial drawing for game
    public void drawGame(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        // Border
        g2d.drawRect(20, 40, 460, 440);

    }

    // Don't touch meeee
    @Override
    public void paint(Graphics g) {

        super.paint(g);

        drawGame(g);

    }
}
