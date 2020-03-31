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
        initDirection(startingCoords);

        // Draw snake at specified coordinates
        Display.drawSnake(g2d);

        // Display completion message
        System.out.println("Snake generated at X:" + startingCoords.getX() + " Y:" + startingCoords.getY());

    }

    public static void initDirection(Randomizer r) {
        switch (r.getDirection()) {
            case "up":
                getPosition().add(new Coordinate(r.getX(), r.getY()));
                getPosition().add(new Coordinate(r.getX(), r.getY() - 1));
                getPosition().add(new Coordinate(r.getX(), r.getY() - 2));
                break;
            case "right":
                getPosition().add(new Coordinate(r.getX(), r.getY()));
                getPosition().add(new Coordinate(r.getX() - 1, r.getY()));
                getPosition().add(new Coordinate(r.getX() - 2, r.getY()));
                break;
            case "down":
                getPosition().add(new Coordinate(r.getX(), r.getY()));
                getPosition().add(new Coordinate(r.getX(), r.getY() + 1));
                getPosition().add(new Coordinate(r.getX(), r.getY() + 2));
                break;
            case "left":
                getPosition().add(new Coordinate(r.getX(), r.getY()));
                getPosition().add(new Coordinate(r.getX() + 1, r.getY()));
                getPosition().add(new Coordinate(r.getX() + 2, r.getY()));
                break;
        }

    }

    public static void updatePosition() {

    }

    public static ArrayList<Coordinate> getPosition() {
        return position;
    }
}
