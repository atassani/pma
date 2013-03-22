package org.pma;

public class PimPam {

	public String play(int number) {
		String result = valueIfNumberDivisibleBy(number, 3, "Pim");
		result += valueIfNumberDivisibleBy(number, 5, "Pam");
		return result;
	}
	
	private String valueIfNumberDivisibleBy(int number, int divisor, String result) {
		if (isDivisibleBy(number, divisor)) return result;
		return "";
	}
	private boolean isDivisibleBy(int number, int divisor) {
		return number % divisor == 0;
	}

}
