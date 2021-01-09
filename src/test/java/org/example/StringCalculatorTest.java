package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StringCalculatorTest {

    @Test
    public void testTwoNumber() {
        StringCalculator sut = new StringCalculator();
        assertEquals(sut.calculate("1,2"), 3);
    }

    public void testEmptyStringShouldReturnZero() {
        StringCalculator sut = new StringCalculator();
        assertEquals(sut.calculate(""), 0);
    }
    @Test
    public void testOneNumberShouldReturnItseft() {
        StringCalculator sut = new StringCalculator();
        assertEquals(sut.calculate("3"), 3);
    }

    @Test
    public void testMoreOneDigits() {
        StringCalculator sut = new StringCalculator();
        assertEquals(sut.calculate("22,55"), 77);
    }

}
