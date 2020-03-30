import java.awt.*;

public class Snake {

    // Allows for variable snake starting lengths
    private int initLength;

    // Basic constructor
    public Snake(int i) {
        initLength = i;
    }

    public static void initSnake(Graphics2D g2d) {

        g2d.fillRect(320, 420, 30, 30);
        g2d.fillRect(350, 420, 30, 30);
        g2d.fillRect(380, 420, 30, 30);

    }

}
