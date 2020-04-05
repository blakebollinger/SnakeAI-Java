import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {

    private int displayWidth = 730;
    private int displayHeight = 800;
    private boolean boardExists = false;
    private Graphics graphics;
    private Graphics2D graphics2d;
    private Font font;

    // Defining parameters for our display,
    public Display() {
        super("Snake Graphics");

        setSize(displayWidth, displayHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void drawSnake(Graphics2D g2d) {

        if (!Snake.doesSnakeExist()) {
            Snake.initSnake();
            Snake.setSnakeExists(true);

        }

        // Draw in head
        g2d.drawRect((Snake.getPosition().get(0).getX() * 30) + 20, (Snake.getPosition().get(0).getY() * 30) + 90, 30, 30);

        // Draw in tail
        for (int i = 1; i < Snake.getPosition().size(); i++) {
            g2d.fillRect((Snake.getPosition().get(i).getX() * 30) + 20, (Snake.getPosition().get(i).getY() * 30) + 90, 30, 30);
        }
    }

    public static void drawFood(Graphics g2d)
    {

        System.out.println("State of food " + Food.getFoodExists());
        if (!Food.getFoodExists()) {
            System.out.println("Food didnt exist...making new food");

            Randomizer f = new Randomizer();
            Food.setX(f.getX());
            Food.setY(f.getY());
            Food.setFoodExists(true);
            Score.addPoints();
        }

        g2d.fillRect((Food.getX() * 30) + 20, (Food.getY() * 30) + 90, 30, 30);

    }

    // Does all initial drawing for game
    public void drawGame(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        initBoard(g2d);
        drawSnake(g2d);
        drawFood(g2d);


    }

    public void initBoard(Graphics2D g2d) {

        // Initializes text font
        Font font = new Font("Helvetica", Font.PLAIN, 12);

        setFont(font);

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
        g2d.drawString(Score.pointsToString(), 20, 80);

        boardExists = true;

    }

    // Don't touch meeee
    @Override
    public void paint(Graphics g) {

        super.paint(g);

        drawGame(g);

    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public Graphics getGraphic() {
        return graphics;
    }

    public int getDisplayHeight() {
        return displayHeight;
    }

    public int getDisplayWidth() {
        return displayWidth;
    }

    @Override
    public Font getFont() {
        return font;
    }

    @Override
    public void setFont(Font font) {
        this.font = font;
    }
}
