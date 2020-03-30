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
        g2d.drawLine(50, 90, 50, 780);
        g2d.drawLine(80, 90, 80, 780);
        g2d.drawLine(110, 90, 110, 780);
        g2d.drawLine(140, 90, 140, 780);
        g2d.drawLine(170, 90, 170, 780);
        g2d.drawLine(200, 90, 200, 780);
        g2d.drawLine(230, 90, 230, 780);
        g2d.drawLine(260, 90, 260, 780);
        g2d.drawLine(290, 90, 290, 780);
        g2d.drawLine(320, 90, 320, 780);
        g2d.drawLine(350, 90, 350, 780);
        g2d.drawLine(380, 90, 380, 780);
        g2d.drawLine(410, 90, 410, 780);
        g2d.drawLine(440, 90, 440, 780);
        g2d.drawLine(470, 90, 470, 780);
        g2d.drawLine(500, 90, 500, 780);
        g2d.drawLine(530, 90, 530, 780);
        g2d.drawLine(560, 90, 560, 780);
        g2d.drawLine(590, 90, 590, 780);
        g2d.drawLine(620, 90, 620, 780);
        g2d.drawLine(650, 90, 650, 780);
        g2d.drawLine(680, 90, 680, 780);

        g2d.drawLine(20, 120, 710, 120);
        g2d.drawLine(20, 150, 710, 150);
        g2d.drawLine(20, 180, 710, 180);
        g2d.drawLine(20, 210, 710, 210);
        g2d.drawLine(20, 240, 710, 240);
        g2d.drawLine(20, 270, 710, 270);
        g2d.drawLine(20, 300, 710, 300);
        g2d.drawLine(20, 330, 710, 330);
        g2d.drawLine(20, 360, 710, 360);
        g2d.drawLine(20, 390, 710, 390);
        g2d.drawLine(20, 420, 710, 420);
        g2d.drawLine(20, 450, 710, 450);
        g2d.drawLine(20, 480, 710, 480);
        g2d.drawLine(20, 510, 710, 510);
        g2d.drawLine(20, 540, 710, 540);
        g2d.drawLine(20, 570, 710, 570);
        g2d.drawLine(20, 600, 710, 600);
        g2d.drawLine(20, 630, 710, 630);
        g2d.drawLine(20, 660, 710, 660);
        g2d.drawLine(20, 690, 710, 690);
        g2d.drawLine(20, 720, 710, 720);
        g2d.drawLine(20, 750, 710, 750);
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
