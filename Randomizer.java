import java.lang.Math;
public class Randomizer {
    private double y;
    private double x;
    public Randomizer(){
        y = Math.random() * 510 - 90;
        x = Math.random() * 510 - 90;
    }
    public int getY(){
        return (int)y;
    }

    public int getX(){
        return (int)x;
    }
}
