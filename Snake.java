import java.awt.*;

public class Snake {

    // Allows for variable snake starting lengths
    private int initLength;

    // Basic constructor
    public Snake(int i) {
        initLength = i;
    }

    public static void initSnake(Graphics2D g2d) {
        Randomizer coords = new Randomizer();
        System.out.println("x " + coords.getX());
        System.out.println("y " + coords.getY());

        g2d.fillRect(coords.getX(), coords.getY(), 30, 30);
        g2d.fillRect(coords.getX()+30, coords.getY(), 30, 30);
        g2d.fillRect(coords.getX()+60, coords.getY(), 30, 30);

    }

}
