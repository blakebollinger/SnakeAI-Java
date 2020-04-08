import neuralNetwork.NeuralNetwork;

public class NeuralNetInteraction {

    // Setup neural network
    private static final int genomes_per_generation = 3;
    private static final int[] neurons_amount = {3, 3, 3};
    private static final NeuralNetwork nn = new NeuralNetwork(neurons_amount, genomes_per_generation, 0.5, -1, 1);
    private static final double[] inputs = new double[4];
    private static double[] outputs = new double[3];

    protected static void learn() {

        // Get the inputs from the game and the output from the neural network
        inputs[0] = NeuralNetFeatures.generateOutput().get(0);
        inputs[1] = NeuralNetFeatures.generateOutput().get(1);
        inputs[2] = NeuralNetFeatures.generateOutput().get(2);
        inputs[3] = NeuralNetFeatures.generateOutput().get(4);
        outputs = nn.getOutputs(inputs);

        // Do an action according to the output value
        if (outputs[0] > outputs[1] && outputs[0] > outputs[2]) {
            Snake.turnLeft();
        } else if (outputs[2] > outputs[0] && outputs[2] > outputs[1]) {
            Snake.turnRight();
        }
    }

    protected static void gameOver() {

        nn.newGenome(Score.getPoints());

    }

}
