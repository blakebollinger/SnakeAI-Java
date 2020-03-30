import java.lang.Math;
public class Randomizer {
    private int y;
    private int x;
    public Randomizer(){
        y = (int)(Math.random() * (23 - 6));
        x = (int)(Math.random() * (23 - 6));
        y +=3;
        x +=3;
        y = (y*30) + 90;
        x = (x*30) + 20;
    }
    public int getY(){
        return y;
    }

    public int getX(){
        return x;
    }
}
