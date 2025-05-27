import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinsTest {

    @Test
    public void binsTest1(){
        Bins results = new Bins(2, 12); //For a set of two dice
        results.incrementBin(10);
        results.incrementBin(10);
        Integer numberOfTens = results.getBin(10);
        assertEquals(2, numberOfTens);
    }

    @Test
    public void binsTest2(){
        Bins results = new Bins(5, 30); //For a set of five dice
        results.incrementBin(30);
        results.incrementBin(30);
        results.incrementBin(30);
        results.incrementBin(30);
        Integer numberOfThirties = results.getBin(30);
        assertEquals(4, numberOfThirties);
    }

    @Test
    public void binsTest3(){
        Bins results = new Bins(4, 24);
        results.incrementBin(18);
        results.incrementBin(18);
        results.incrementBin(18);
        results.incrementBin(18);
        results.incrementBin(18);
        Integer numberOfEighteens = results.getBin(18);
        assertEquals(5, numberOfEighteens);
    }

    @Test
    public void testOutOfBounds(){
        Bins results = new Bins(2, 12); //Two dice

        results.incrementBin(1); //Out of bounds using 1
        Integer numberOfOnes = results.getBin(1);
        assertEquals(0, numberOfOnes);

        results.incrementBin(13); //Out of bounds using 13
        Integer numberOfThirteens = results.getBin(13);
        assertEquals(0, numberOfThirteens);
    }
}
