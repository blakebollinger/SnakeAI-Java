import java.util.ArrayList;

public class NeuralNetFeatures {

    public static ArrayList<Integer> generateOutput() {

        ArrayList<Integer> output = checkDirections();

        output.add(suggestDirection());

        return output;

    }

    public static int suggestDirection() {

        // Can snake go straight
        if (checkDirections().get(1) == 0) {
            return 0;
        }
        // If not straight, left?
        else if (checkDirections().get(0) == 0) {
            return -1;
        }
        // If all else fails, can we go right?
        else if (checkDirections().get(2) == 0) {
            return 1;
        }

        // If the snake unfortunately waltzed into a corner...
        // Just take what's coming
        else {
            return 0;
        }
    }

    public static ArrayList<Integer> checkDirections() {

        switch (Snake.getDirection()) {
            case "up":
                return checkUp();
            case "right":
                return checkRight();
            case "down":
                return checkDown();
            case "left":
                return checkLeft();
            default:
                System.out.println("ERROR IN NEURAL NET FEATURE BUILDING");
                ArrayList<Integer> output = new ArrayList<>();
                output.add(0);
                output.add(0);
                output.add(0);
                return output;
        }

    }

    public static ArrayList<Integer> checkUp() {

        ArrayList<Integer> output = new ArrayList<>();

        // Can snake turn left
        for (int i = 1; i < Snake.getPosition().size(); i++) {
            if (Snake.getPosition().get(0).getX() - 1 == Snake.getPosition().get(i).getX() &&
                    Snake.getPosition().get(0).getY() == Snake.getPosition().get(i).getY()) {
                output.add(1);
                break;
            }
            if (Snake.getPosition().get(0).getX() - 1 == -1) {
                output.add(1);
                break;
            }
        }

        if (output.size() == 0) {
            output.add(0);
        }

        // Can snake go forward
        for (int i = 1; i < Snake.getPosition().size(); i++) {
            if (Snake.getPosition().get(0).getY() - 1 == Snake.getPosition().get(i).getY() &&
                    Snake.getPosition().get(0).getX() == Snake.getPosition().get(i).getX()) {
                output.add(1);
                break;
            }
            if (Snake.getPosition().get(0).getY() - 1 == -1) {
                output.add(1);
                break;
            }
        }

        if (output.size() == 1) {
            output.add(0);
        }

        // Can snake turn right
        for (int i = 1; i < Snake.getPosition().size(); i++) {
            if (Snake.getPosition().get(0).getX() + 1 == Snake.getPosition().get(i).getX() &&
                    Snake.getPosition().get(0).getY() == Snake.getPosition().get(i).getY()) {
                output.add(1);
                break;
            }
            if (Snake.getPosition().get(0).getX() + 1 == 23) {
                output.add(1);
                break;
            }
        }

        if (output.size() == 2) {
            output.add(0);
        }

        return output;

    }

    public static ArrayList<Integer> checkRight() {

        ArrayList<Integer> output = new ArrayList<>();

        // Can snake turn left
        for (int i = 1; i < Snake.getPosition().size(); i++) {
            if (Snake.getPosition().get(0).getY() - 1 == Snake.getPosition().get(i).getY() &&
                    Snake.getPosition().get(0).getX() == Snake.getPosition().get(i).getX()) {
                output.add(1);
                break;
            }
            if (Snake.getPosition().get(0).getY() - 1 == -1) {
                output.add(1);
                break;
            }
        }

        if (output.size() == 0) {
            output.add(0);
        }

        // Can snake go forward
        for (int i = 1; i < Snake.getPosition().size(); i++) {
            if (Snake.getPosition().get(0).getX() + 1 == Snake.getPosition().get(i).getX() &&
                    Snake.getPosition().get(0).getY() == Snake.getPosition().get(i).getY()) {
                output.add(1);
                break;
            }
            if (Snake.getPosition().get(0).getX() + 1 == 23) {
                output.add(1);
                break;
            }
        }

        if (output.size() == 1) {
            output.add(0);
        }

        for (int i = 1; i < Snake.getPosition().size(); i++) {
            if (Snake.getPosition().get(0).getY() + 1 == Snake.getPosition().get(i).getY() &&
                    Snake.getPosition().get(0).getX() == Snake.getPosition().get(i).getX()) {
                output.add(1);
                break;
            }
            if (Snake.getPosition().get(0).getY() + 1 == 23) {
                output.add(1);
                break;
            }
        }

        if (output.size() == 2) {
            output.add(0);
        }

        return output;

    }

    public static ArrayList<Integer> checkDown() {

        ArrayList<Integer> output = new ArrayList<>();

        // Can snake turn left
        for (int i = 1; i < Snake.getPosition().size(); i++) {
            if (Snake.getPosition().get(0).getX() + 1 == Snake.getPosition().get(i).getX() &&
                    Snake.getPosition().get(0).getY() == Snake.getPosition().get(i).getY()) {
                output.add(1);
                break;
            }
            if (Snake.getPosition().get(0).getX() + 1 == 23) {
                output.add(1);
                break;
            }
        }
        if (output.size() == 0) {
            output.add(0);
        }

        // Can snake go forward
        for (int i = 1; i < Snake.getPosition().size(); i++) {
            if (Snake.getPosition().get(0).getY() + 1 == Snake.getPosition().get(i).getY() &&
                    Snake.getPosition().get(0).getX() == Snake.getPosition().get(i).getX()) {
                output.add(1);
                break;
            }
            if (Snake.getPosition().get(0).getY() + 1 == 23) {
                output.add(1);
                break;
            }
        }

        if (output.size() == 1) {
            output.add(0);
        }

        // Can snake turn right
        for (int i = 1; i < Snake.getPosition().size(); i++) {
            if (Snake.getPosition().get(0).getX() - 1 == Snake.getPosition().get(i).getX() &&
                    Snake.getPosition().get(0).getY() == Snake.getPosition().get(i).getY()) {
                output.add(1);
                break;
            }
            if (Snake.getPosition().get(0).getX() - 1 == -1) {
                output.add(1);
                break;
            }
        }

        if (output.size() == 2) {
            output.add(0);
        }

        return output;

    }

    public static ArrayList<Integer> checkLeft() {

        ArrayList<Integer> output = new ArrayList<>();

        // Can snake turn left
        for (int i = 1; i < Snake.getPosition().size(); i++) {
            if (Snake.getPosition().get(0).getY() + 1 == Snake.getPosition().get(i).getY() &&
                    Snake.getPosition().get(0).getX() == Snake.getPosition().get(i).getX()) {
                output.add(1);
                break;
            }
            if (Snake.getPosition().get(0).getY() + 1 == 23) {
                output.add(1);
                break;
            }
        }

        if (output.size() == 0) {
            output.add(0);
        }

        // Can snake go forward
        for (int i = 1; i < Snake.getPosition().size(); i++) {
            if (Snake.getPosition().get(0).getX() - 1 == Snake.getPosition().get(i).getX() &&
                    Snake.getPosition().get(0).getY() == Snake.getPosition().get(i).getY()) {
                output.add(1);
                break;
            }
            if (Snake.getPosition().get(0).getX() - 1 == -1) {
                output.add(1);
                break;
            }
        }

        if (output.size() == 1) {
            output.add(0);
        }

        // Can snake turn right
        for (int i = 1; i < Snake.getPosition().size(); i++) {
            if (Snake.getPosition().get(0).getY() - 1 == Snake.getPosition().get(i).getY() &&
                    Snake.getPosition().get(0).getX() == Snake.getPosition().get(i).getX()) {
                output.add(1);
                break;
            }
            if (Snake.getPosition().get(0).getY() - 1 == -1) {
                output.add(1);
                break;
            }
        }

        if (output.size() == 2) {
            output.add(0);
        }

        return output;

    }

}
