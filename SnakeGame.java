import javax.swing.*;

public class SnakeGame {


    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to Snake");

        System.out.println("Generating game...");

        // Quick Swing implementation drawing our game
        SwingUtilities.invokeLater(() -> new Display().setVisible(true));

        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println(Snake.getPosition());
            Thread.sleep(2000);
            Snake.updatePosition();
        }


    }


}