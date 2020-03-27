import javax.swing.*;

public class main {


    public static void main(String[] args) {
        System.out.println("Welcome to Snake");

        // Quick Swing implementation drawing our game
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Display().setVisible(true);
            }
        });


    }


}