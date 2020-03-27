import javax.swing.*;

public class main {


    public static void main(String[] args) {
        System.out.println("Hello World!");


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Display().setVisible(true);
            }
        });


    }


}