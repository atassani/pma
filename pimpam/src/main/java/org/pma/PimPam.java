package org.pma;

public class PimPam {
	int[] divisorValues = new int[] {3, 5};
	String[] messageValues = new String[]{"Pim", "Pam"};
	
	public String play(int number) {
		String message = "";
		for (int i = 0; i < divisorValues.length; i++) {
			message += divisibleRule(number, divisorValues[i], messageValues[i]);
		}
		return message;
	}
	
	private String divisibleRule(int number, int divisor, String message) {
		if (isDivisibleBy(number, divisor)) return message;	
		return "";
	}
	
	private boolean isDivisibleBy(int number, int divisor) {
		return number % divisor == 0;
	}

}
