package calculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
class StringCalculatorShould {
	
	private StringCalculator stringCalculator;
	
	@BeforeTest
	public void init() {
		stringCalculator = new StringCalculator();
	}

	//Below method takes empty String and returns 0 
    public void empty_string_should_return_0() {
        assertEquals(0, stringCalculator.add(""));
    }
    
    //Below method takes single number in String format and returns a number as integer 
    public void string_with_single_number_should_return_number_as_int() {
        assertEquals(stringCalculator.add("1"),1);
    }
    
    //Below Method takes two numbers as an input and test with their addition
    public void twoNumbersCommaDelimitedReturnSum()throws Exception {
    	assertEquals(stringCalculator.add("1,2"),3);
    }
    
    public void threeNumbersDelimitedBothWayReturnSum() throws Exception{
    	assertEquals(stringCalculator.add("1,2,3"),6);
    }
    
}
