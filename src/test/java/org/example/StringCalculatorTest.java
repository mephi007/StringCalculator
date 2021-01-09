package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StringCalculatorTest {

    @Test
    public void testTwoNumber() {
        StringCalculator sut = new StringCalculator();
        assertEquals(3, sut.calculate("1,2"));
    }

    public void testEmptyStringShouldReturnZero() {
        StringCalculator sut = new StringCalculator();
        assertEquals(0, sut.calculate(""));
    }
    @Test
    public void testOneNumberShouldReturnItseft() {
        StringCalculator sut = new StringCalculator();
        assertEquals(3,sut.calculate("3"));
    }

    @Test
    public void testMoreOneDigits() {
        StringCalculator sut = new StringCalculator();
        assertEquals(77, sut.calculate("22,55"));
    }

    //Allow the Add method to handle an unknown amount of numbers
    @Test
    public void testUnknownAmountOfNnumersAsInput() {
        StringCalculator sut = new StringCalculator();
        assertEquals(38, sut.calculate("1,2,3,4,5,6,8,9"));
    }

    //Allow the Add method to handle new lines between numbers (instead of commas).

    @Test
    public void testNewLineAsDelimiter() {
        StringCalculator sut = new StringCalculator();
        assertEquals(6, sut.calculate("1\n2,3"));
    }

    @Test
    public void testSupportForCustomDelimiter() {
        StringCalculator sut = new StringCalculator();
        assertEquals(10, sut.calculate(";\n1;2;3;4"));
    }


    //Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed.

    @Test
    public void testNegativeNumbers(){
        StringCalculator sut = new StringCalculator();
        try {
            sut.calculate("-1;4");
            fail("exception should have been thrown");
        }
        catch (IllegalArgumentException e) {
            assertEquals("negatives not allowed -1", e.getMessage());
        }
    }
}
