package org.pma;

public class DivisibleRule {
	private String message;
	private int divisor;

	public DivisibleRule(int divisor, String message) {
		this.divisor = divisor;
		this.message = message;
	}
	
	public String apply(int number) {
		if (isDivisibleBy(number, divisor)) return message;	
		return "";
	}
	
	private boolean isDivisibleBy(int number, int divisor) {
		return number % divisor == 0;
	}
}
