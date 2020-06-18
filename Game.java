import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game {

    int gameSpeed = 500;
    Display display;
    KeyListener key = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent keyEvent) {

        }

        @Override
        public void keyPressed(KeyEvent keyEvent) {
            int keyPressed = keyEvent.getKeyCode();

            switch (keyPressed) {
                case 87:
                    if (!Snake.getDirection().equals("down")) {
                        Snake.setDirection("up");
                    }
                    break;
                case 68:
                    if (!Snake.getDirection().equals("left")) {
                        Snake.setDirection("right");
                    }
                    break;
                case 83:
                    if (!Snake.getDirection().equals("up")) {
                        Snake.setDirection("down");
                    }
                    break;
                case 65:
                    if (!Snake.getDirection().equals("right")) {
                        Snake.setDirection("left");
                    }
                    break;
                default:
                    break;
            }
        }

        @Override
        public void keyReleased(KeyEvent keyEvent) {

        }
    };

    public Game() throws InterruptedException {

        display = new Display();
        display.setVisible(true);

        display.addKeyListener(key);

        Thread.sleep(5000);

    }

    public void end() throws InterruptedException {

        Graphics2D g2d = (Graphics2D) display.getGraphics();

        g2d.setColor(Color.WHITE);

        g2d.fillRect(0, 0, 730, 800);

        g2d.setColor(Color.black);

        String loseMessage = "Placeholder Message...You Lose        Please Restart the game";

        g2d.drawString(loseMessage,
                (display.getDisplayWidth() - display.getFontMetrics(display.getFont()).stringWidth(loseMessage)) / 2,
                400);

        Thread.sleep(2000);

        System.exit(0);

    }

    public void start() throws InterruptedException {

        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println(Snake.getPosition());
            Thread.sleep(gameSpeed);
            Snake.updatePosition();
            this.getDisplay().update(this.getDisplay().getGraphics());


            // Move Snake
            // Update position
            // Update Graphics

            // Edge Detect

            Snake.isValidPosition();

            // Food Detect

            // User input detect
        }
    }

    public Display getDisplay() {
        return display;
    }
}
