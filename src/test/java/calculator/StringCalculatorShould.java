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

	// Below method takes empty String and returns 0
	public void empty_string_should_return_0() {
		assertEquals(0, stringCalculator.add(""));
	}

	// Below method takes single number in String format and returns a number as
	// integer
	public void string_with_single_number_should_return_number_as_int() {
		assertEquals(stringCalculator.add("1"), 1);
	}

	// Below Method takes two numbers as an input and test with their addition
	public void twoNumbersCommaDelimitedReturnSum() throws Exception {
		assertEquals(stringCalculator.add("1,2"), 3);
	}

	// Below Method test weather our add function can handle number of input or not
	public void threeNumbersDelimitedBothWayReturnSum() throws Exception {
		assertEquals(stringCalculator.add("1,2,3"), 6);
	}

	// below method handle's new line between numbers
	public void twoNumbersNewLineDelimitedReturnSum() throws Exception {
		assertEquals(stringCalculator.add("1\n2,3"), 6);
	}
	
	//below method to test weather our method supports different delimiter or not
	 public void multipleDelimiterReturnSum() throws Exception {
	    	assertEquals(stringCalculator.add("1;2"),3);
	    }
	    
	
}
