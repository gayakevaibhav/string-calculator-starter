package calculator;

class StringCalculator {
	//delimiter
	private final String delimiter = ",|\n|;|/";
	
	//method which is getting called 
	public int add(String input) throws Exception {

		String[] numbers = input.split(delimiter);

		if (isEmpty(input)) {
			return 0;
		}
		if (input.length() == 1) {
			return stringToInt(input);
		} else {
			return getSum(numbers);
		}

	}
	
	//this method add all numbers which are passed in string format
	private int getSum(String numbers[]) throws Exception {
		findDangerousInput(numbers);
		int sum = 0;
		for (String current : numbers) {
			if (stringToInt(current) > 1000) {
				continue;
			}
			sum = sum + Integer.parseInt(current);
		}
		return sum;
	}
	
	//this method throws exception for negative numbers
	private void findDangerousInput(String numbers[]) throws Exception {
		for (String current : numbers) {
			if (stringToInt(current) < 0) {
				throw new Exception("negatives not allowed");
			}
		}
	}
	
	//this method check weather the string is empty or not
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}

	//this method is to change string into integer format
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}

}