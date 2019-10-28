package au.training.exercise3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxCalculationTest {

    @Test
    public void testCalculateAverage() {

        int caluclatedMin = MaxCalculation.calculateMax(1, 2, 3);
        assertEquals(3, caluclatedMin);

        caluclatedMin = MaxCalculation.calculateMax(5, 5, 5, 5);
        assertEquals(5, caluclatedMin);

        caluclatedMin = MaxCalculation.calculateMax(5, 15, 25);
        assertEquals(25, caluclatedMin);

        caluclatedMin = MaxCalculation.calculateMax(99);
        assertEquals(99, caluclatedMin);


    }

}