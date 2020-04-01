import java.util.ArrayList;

public class Snake {

    // Allows for variable snake starting lengths
    private int initLength;
    private static ArrayList<Coordinate> position = new ArrayList<>();
    private static String direction;
    private static boolean snakeExists;

    // Basic constructor
    public Snake(int i) {
        initLength = i;
    }

    public static void initSnake() {
        // Generate random starting coordinates
        Randomizer startingCoords = new Randomizer();
        initDirection(startingCoords);

        // Display completion message
        System.out.println("Snake generated at X:" + startingCoords.getX() + " Y:" + startingCoords.getY());

    }

    public static void initDirection(Randomizer r) {
        switch (r.getDirection()) {
            case "up":
                direction = "up";
                getPosition().add(new Coordinate(r.getX(), r.getY()));
                getPosition().add(new Coordinate(r.getX(), r.getY() + 1));
                getPosition().add(new Coordinate(r.getX(), r.getY() + 2));
                break;
            case "right":
                direction = "right";
                getPosition().add(new Coordinate(r.getX(), r.getY()));
                getPosition().add(new Coordinate(r.getX() - 1, r.getY()));
                getPosition().add(new Coordinate(r.getX() - 2, r.getY()));
                break;
            case "down":
                direction = "down";
                getPosition().add(new Coordinate(r.getX(), r.getY()));
                getPosition().add(new Coordinate(r.getX(), r.getY() - 1));
                getPosition().add(new Coordinate(r.getX(), r.getY() - 2));
                break;
            case "left":
                direction = "left";
                getPosition().add(new Coordinate(r.getX(), r.getY()));
                getPosition().add(new Coordinate(r.getX() + 1, r.getY()));
                getPosition().add(new Coordinate(r.getX() + 2, r.getY()));
                break;
        }

    }

    public static void updatePosition() {

        for (int i = position.size(); i > 1; i--) {
            position.get(i - 1).setY(position.get(i - 2).getY());
            position.get(i - 1).setX(position.get(i - 2).getX());
        }

        switch (direction) {
            case "up":
                position.get(0).setY(position.get(0).getY() - 1);
                break;
            case "right":
                position.get(0).setX(position.get(0).getX() + 1);
                break;
            case "down":
                position.get(0).setY(position.get(0).getY() + 1);
                break;
            case "left":
                position.get(0).setX(position.get(0).getX() - 1);
                break;
            default:
                System.out.println("ERROR: INCORRECT DIRECTION OBTAINED IN UPDATEPOSITION");
                break;
        }

    }

    public static boolean doesSnakeExist() {
        return snakeExists;
    }

    public static void setSnakeExists(boolean snakeExists) {
        Snake.snakeExists = snakeExists;
    }

    public static ArrayList<Coordinate> getPosition() {
        return position;
    }

    public static String getDirection() {
        return direction;
    }

    public static void setDirection(String direction) {
        Snake.direction = direction;
    }

    public static void isValidPosition() {

        for (Coordinate coordinate : position) {
            if (coordinate.getX() < 0 || coordinate.getX() > 23
                    || coordinate.getY() < 0 || coordinate.getY() > 23) {
                SnakeGame.getMainGame().end();
            }
        }

    }
}
