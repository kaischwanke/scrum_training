package au.training.exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinCalculationTest {

    @Test
    public void testCalculateAverage() {

        int caluclatedMin = MinCalculation.calculateMin(1, 2, 3);
        assertEquals(1, caluclatedMin);

        caluclatedMin = MinCalculation.calculateMin(5, 5, 5, 5);
        assertEquals(5, caluclatedMin);

        caluclatedMin = MinCalculation.calculateMin(5, 15, 25);
        assertEquals(5, caluclatedMin);

        caluclatedMin = MinCalculation.calculateMin(99);
        assertEquals(99, caluclatedMin);


    }

}