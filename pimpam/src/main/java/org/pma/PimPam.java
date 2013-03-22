package org.pma;

public class PimPam {
	int[] divisorValues = new int[] {3, 5};
	String[] messageValues = new String[]{"Pim", "Pam"};
	
	public String play(int number) {
		return divisibleRule(number);
	}
	
	private String divisibleRule(int number) {
		String message = "";
		for (int i = 0; i < divisorValues.length; i++) {
			if (isDivisibleBy(number, divisorValues[i])) message += messageValues[i];	
		}
		return message;
	}
	
	private boolean isDivisibleBy(int number, int divisor) {
		return number % divisor == 0;
	}

}
