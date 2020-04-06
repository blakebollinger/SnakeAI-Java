import neuralNetwork.NeuralNetwork;

public class NeuralNetInteraction {

    // Setup neural network
    private static final int genomes_per_generation = 3;
    private static final int[] neurons_amount = {5, 3, 3};
    private static final NeuralNetwork nn = new NeuralNetwork(neurons_amount, genomes_per_generation, 0.5, -1, 1);
    private static final double[] inputs = new double[6];
    private static double[] outputs = new double[3];
    protected boolean autoplay = true;

    protected static void learn() {

        // Get the inputs from the game and the output from the neural network
        inputs[0] = NeuralNetFeatures.generateOutput().get(0);
        inputs[1] = NeuralNetFeatures.generateOutput().get(1);
        inputs[2] = NeuralNetFeatures.generateOutput().get(2);
        inputs[3] = 0;
        inputs[4] = 0;
        inputs[5] = 0;
        outputs = nn.getOutputs(inputs);

        // Do an action according to the output value
        if (outputs[0] > 0.5) {
            System.out.println("GETTING OUTPUT: " + outputs[0]);
        } else {
            System.out.println("GETTING OUTPUT: " + outputs[0]);
        }
    }

}
