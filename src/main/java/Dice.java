import java.util.Random;

public class Dice {
    private final int diceNumber;
    private final Random randomNum;

    public Dice(int diceNumber){
        this.diceNumber = diceNumber;
        this.randomNum = new Random();
    }

    public int tossAndSum(){
        int sum = 0;
        for (int i = 0; i < diceNumber; i++) {
            int roll = randomNum.nextInt(6) + 1;
            sum += roll;
        }
        return sum;
    }
}