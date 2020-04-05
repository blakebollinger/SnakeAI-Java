public class Score {
    private static int points = -1;

    public Score() {
        points = -1;
    }

    public static int getPoints() {
        return points;
    }

    public static void addPoints() {
        points ++;
    }

    public static String pointsToString()
    {
        return "Score: " + getPoints();
    }


}
