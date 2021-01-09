package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StringCalculatorTest {

    @Test
    public void emptyStringShouldReturnZero() {
        StringCalculator sut = new StringCalculator();
        assertEquals(sut.calculate("1,2"), 3);
    }

}
