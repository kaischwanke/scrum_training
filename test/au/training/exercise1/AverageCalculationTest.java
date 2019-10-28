package au.training.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AverageCalculationTest {

    @Test
    public void testCalculateAverage() {

        int calculatedAverage = AverageCalculation.calculateAverage(1, 2, 3);
        assertEquals(2, calculatedAverage);

        calculatedAverage = AverageCalculation.calculateAverage(5, 5, 5, 5);
        assertEquals(5, calculatedAverage);

        calculatedAverage = AverageCalculation.calculateAverage(99);
        assertEquals(99, calculatedAverage);


    }

}