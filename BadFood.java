public class BadFood {
private static int x;
private static int y;
private static boolean badFoodExists;



public BadFood(Randomizer f) {

        x = f.getX();
        y = f.getY();

        }


public static void setBadFoodExists(boolean foodExists) {
        BadFood.badFoodExists = badFoodExists;
        }

public static boolean getBadFoodExists() {
        return badFoodExists;
        }

public static int getX() {
        return x;
        }

public static void setX(int x) {
        BadFood.x = x;
        }

public static int getY() {
        return y;
        }

public static void setY(int y) {BadFood.y = y;}

        }

