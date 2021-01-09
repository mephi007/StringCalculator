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

    //Allow the Add method to handle an unknown amount of numbers
    @Test
    public void testUnknownAmountOfNnumersAsInput() {
        StringCalculator sut = new StringCalculator();
        assertEquals(sut.calculate("1,2,3,4,5,6,8,9"), 38);
    }

    //Allow the Add method to handle new lines between numbers (instead of commas).

    @Test
    public void testNewLineAsDelimiter() {
        StringCalculator sut = new StringCalculator();
        assertEquals(sut.calculate("1\n2,3"), 6);
    }

}
