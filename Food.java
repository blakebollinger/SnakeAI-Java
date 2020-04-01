public class Food {
    private int x;
    private int y;


    public Food(Randomizer f)
    {

        x = f.getX();
        y = f.getY();
    }



    public int getX(){return x;}

    public int getY(){return y;}



}
