public class Food {
    private int x;
    private int y;
    private static boolean foodExists;


    public Food(Randomizer f)
    {

        x = f.getX();
        y = f.getY();

    }


    public static void setFoodExists(boolean foodExists){Food.foodExists = foodExists;}

    public static boolean getFoodExists(){return foodExists;}
    public int getX(){return x;}
    public int getY(){return y;}



}
