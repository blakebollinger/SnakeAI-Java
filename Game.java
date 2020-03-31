public class Game {

    Display display;

    public Game() {

        display = new Display();
        display.setVisible(true);

    }

    public void start() throws InterruptedException {

        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println(Snake.getPosition());
            Thread.sleep(2000);
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
