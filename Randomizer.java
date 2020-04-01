public class Randomizer {

    private int y;
    private int x;
    private int direction;

    public Randomizer() {

        y = ((int) (Math.random() * (23 - 6))) + 3;
        x = ((int) (Math.random() * (23 - 6))) + 3;
        direction = 3;
        System.out.println(direction);
    }

    public String getDirection() {

        switch (direction) {
            case 0:
                return "up";
            case 1:
                return "right";
            case 2:
                return "down";
            case 3:
                return "left";
            default:
                System.out.println("Direction didn't match 0-3");
                return null;
        }
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
