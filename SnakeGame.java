import javax.swing.*;

public class SnakeGame {


    public static void main(String[] args) {

        System.out.println("Welcome to Snake");

        System.out.println("Generating game...");

        // Quick Swing implementation drawing our game
        SwingUtilities.invokeLater(() -> new Display().setVisible(true));


    }


}