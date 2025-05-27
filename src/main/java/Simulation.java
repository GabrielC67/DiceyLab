public class Simulation {
    private final int numberOfDice;
    private final int numberOfTosses;
    private final Dice dice;
    private final Bins bins;

    public Simulation(int numberOfDice, int numberOfTosses){
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        this.dice = new Dice(numberOfDice);
        this.bins = new Bins(numberOfDice, numberOfDice * 6);
    }

    public void runSimulation() {
        for (int i = 0; i < numberOfTosses; i++) {
            int sum = dice.tossAndSum();
            bins.incrementBin(sum);
        }
    }

    public void printResults(){
        System.out.println("***");
        System.out.printf("Simulation of %d dice tossed for %d times.%n", numberOfDice, numberOfTosses);
        System.out.println("***\n");

        for (int i = bins.getMin(); i <= bins.getMax(); i++) {
            int count = bins.getBin(i);
            double percentage = (double) count / numberOfTosses;
            int stars = (int) (percentage * 100); //1 star per 1%

            System.out.printf("%2d : %7d: %.2f %s%n", i, count, percentage, "*".repeat(stars));
        }
    }

    public static void main(String[] args){
        Simulation sim = new Simulation(2, 1000000);

        sim.runSimulation();

        sim.printResults();
    }

}
