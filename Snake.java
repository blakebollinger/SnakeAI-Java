import java.awt.*;
import java.util.ArrayList;

public class Snake {

    // Allows for variable snake starting lengths
    private int initLength;
    private static ArrayList<Coordinate> position = new ArrayList<>();

    // Basic constructor
    public Snake(int i) {
        initLength = i;
    }

    public static void initSnake(Graphics2D g2d) {
        // Generate random starting coordinates
        Randomizer startingCoords = new Randomizer();
        getPosition().add(new Coordinate(startingCoords.getX(), startingCoords.getY()));
        getPosition().add(new Coordinate(startingCoords.getX() + 1, startingCoords.getY()));
        getPosition().add(new Coordinate(startingCoords.getX() + 2, startingCoords.getY()));

        // Draw snake at specified coordinates
        Display.drawSnake(g2d);

        // Display completion message
        System.out.println("Snake generated at X:" + startingCoords.getX() + " Y:" + startingCoords.getY());

    }

    public static void updatePosition() {

    }

    public static ArrayList<Coordinate> getPosition() {
        return position;
    }
}
