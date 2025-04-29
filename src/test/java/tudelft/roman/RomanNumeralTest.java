package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    private RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        this.roman = new RomanNumeral();
    }
    @Test
    public void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }
    @Test
    public void testComplexNumberXIX() {
        int result = roman.convert("XIX");
        Assertions.assertEquals(19, result);
    }
    @Test
    public void testComplexNumberMCMXC() {
        int result = roman.convert("MCMXC");
        Assertions.assertEquals(1990, result);
    }
}
