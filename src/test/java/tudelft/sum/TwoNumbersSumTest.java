package tudelft.sum;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {

    @Test
    public void testSingleDigitAdditionWithoutCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(2, 3)),
                new ArrayList<>(Arrays.asList(4, 5))
        );
        assertEquals(Arrays.asList(6, 8), result);
    }

    @Test
    public void testAdditionWithCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(9, 9)),
                new ArrayList<>(Arrays.asList(1))
        );
        assertEquals(Arrays.asList(1, 0, 0), result);
    }

    @Test
    public void testAdditionDifferentLengths() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(9, 9))
        );
        assertEquals(Arrays.asList(2, 2, 2), result);
    }

    @Test
    public void testZeroAddition() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(0)),
                new ArrayList<>(Arrays.asList(0))
        );
        assertEquals(Arrays.asList(0), result);
    }
}
