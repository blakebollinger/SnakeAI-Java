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

    public void start() throws InterruptedException {

        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println(Snake.getPosition());
            Thread.sleep(gameSpeed);
            Snake.updatePosition();
            this.getDisplay().update(this.getDisplay().getGraphics());
        }

        // Move Snake
        // Update position
        // Update Graphics

        // Edge Detect

        // Food Detect

        // User input detect
    }

    public Display getDisplay() {
        return display;
    }
}
