import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest{
    @Test
    public void testTossAndSumWith2Dice(){
        Dice dice = new Dice(2);
        int sum = dice.tossAndSum();
        assertTrue(sum >= 2 && sum <= 12, "Sum should be between 2 and 12 for 2 dice");
    }

    @Test
    public void testTossAndSumWithFiveDice(){
        Dice dice = new Dice(5);
        int sum = dice.tossAndSum();
        assertTrue(sum >= 5 && sum <= 30, "Sum should be between 5 and 30 for 5 dice");
    }
}