package org.pma;

public class PimPam {

	private static final int whenDivisibleByThree = 3;
	private static final int whenDivisibleByFive = 5;
	private static final String thenReturnPIM = "Pim";
	private static final String thenReturnPAM = "Pam";
	
	public String play(int number) {
		String message = applyRuleTo(number, whenDivisibleByThree, thenReturnPIM);
		message += applyRuleTo(number, whenDivisibleByFive, thenReturnPAM);
		return message;
	}
	
	private String applyRuleTo(int number, int divisor, String message) {
		if (isDivisibleBy(number, divisor)) return message;
		return "";
	}
	
	private boolean isDivisibleBy(int number, int divisor) {
		return number % divisor == 0;
	}

}
