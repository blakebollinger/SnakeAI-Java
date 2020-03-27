import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {

    public Display() {
        super("Snake Graphics");

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setLocationRelativeTo(null);

    }

    public void drawGame(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawRect(20, 40, 460, 440);

    }


    public void paint(Graphics g) {

        super.paint(g);

        drawGame(g);

    }
}
