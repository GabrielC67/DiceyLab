
public class Bins {
    private final int[] bins;
    private final int min; //For each number of Dice, there is a minimum value (sum)
    private final int max; //For each number of dice, there is a maximum value (sum)

    //Constructor
    public Bins(int min, int max){
        this.min = min;
        this.max = max;
        this.bins = new int[max + 1];
    }

    //Boundaries are set through the if statement.
    public void incrementBin(int value){
        if(value >= min && value <= max){
            bins[value]++;
        }
    }

    //Boundaries are set through the if statement
    public int getBin(int value){
        if (value >= min && value <= max){
            return bins[value];
        }
        return 0;
    }


    public int getMin(){
        return min;
    }

    public int getMax(){
        return max;
    }

    public int[] getBins(){
        return bins;
    }
}
