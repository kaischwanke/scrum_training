package au.training.exercise4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumCalculationTest {

    @Test
    public void testCalculateSum() {

        int caluclatedMin = SumCalculation.calculateSum(1, 2, 3);
        assertEquals(6, caluclatedMin);

        caluclatedMin = SumCalculation.calculateSum(5, 5, 5, 5);
        assertEquals(20, caluclatedMin);

        caluclatedMin = SumCalculation.calculateSum(5, 15, 25);
        assertEquals(45, caluclatedMin);

        caluclatedMin = SumCalculation.calculateSum(99);
        assertEquals(99, caluclatedMin);


    }

}