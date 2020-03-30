public class Randomizer {

    private int y;
    private int x;

    public Randomizer(){
        y = (int)(Math.random() * (23 - 6));
        x = (int)(Math.random() * (23 - 6));
    }

    public int getY(){
        return y;
    }

    public int getX(){
        return x;
    }
}
