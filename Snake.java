import java.util.ArrayList;
import java.util.Collections;

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
        eatDetect();
        System.out.println(eatDetect());
        if(eatDetect())
        {
            position.add(new Coordinate(position.get(position.size() - 1).getX()-1, position.get(position.size() - 1).getY()-1));
            Food.setFoodExists(false);
        }


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
  
  
    public static boolean eatDetect()
    {
        boolean eat;
        eat = Food.getX() == getPosition().get(0).getX() && Food.getY() == Snake.getPosition().get(0).getY();
        return eat;
    }

    public static double distUp() {

        if (!(direction.equals("down"))) {
            System.out.println("Trying to calc");
            double distToTop = (-position.get(0).getY()) * -1;
            int distCounter = 0;
            ArrayList<Double> distList = new ArrayList<>();

            distList.add(distToTop);

            for (int i = 1; i < position.size(); i++) {
                if (position.get(i).getX() == position.get(0).getX()) {
                    distList.add((double) ((position.get(i).getY()) - position.get(0).getY()) * -1);
                }
            }

            Collections.sort(distList);

            for (Double i : distList) {
                if (i > 0) {
                    return i;
                }
            }
        }
        return 0.0;
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

    public static void isValidPosition() throws InterruptedException {

        if (position.get(0).getX() < 0 || position.get(0).getX() >= 23 ||
                position.get(0).getY() < 0 || position.get(0).getY() >= 23) {
            SnakeGame.getMainGame().end();
        }
        for (int i = 1; i < position.size(); i++) {
            if (position.get(0).getX() == position.get(i).getX() &&
                    position.get(0).getY() == position.get(i).getY()) {
                SnakeGame.getMainGame().end();
            }
        }
    }
}
