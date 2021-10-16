package calculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;


class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

 
}
