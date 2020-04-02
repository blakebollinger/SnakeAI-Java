public class Food {
    private static int x;
    private static int y;
    private static boolean foodExists;


    public Food(Randomizer f) {

        x = f.getX();
        y = f.getY();

    }


    public static void setFoodExists(boolean foodExists) {
        Food.foodExists = foodExists;
    }

    public static boolean getFoodExists() {
        return foodExists;
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Food.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        Food.y = y;
    }
}
