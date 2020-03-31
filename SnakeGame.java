public class SnakeGame {


    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to Snake");

        System.out.println("Generating game...");

        Game mainGame = new Game();

        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println(Snake.getPosition());
            Thread.sleep(2000);
            Snake.updatePosition();
            mainGame.getDisplay().update(mainGame.getDisplay().getGraphics());
        }


    }


}