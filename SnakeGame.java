public class SnakeGame {

    private static Game mainGame;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to Snake");

        System.out.println("Generating game...");

        mainGame = new Game();

        mainGame.start();


    }

    public static Game getMainGame() {
        return mainGame;
    }
}