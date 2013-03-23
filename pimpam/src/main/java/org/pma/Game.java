package org.pma;

import java.util.List;

public class Game {
	List<DivisibleRule> divisibleRules;
	
	public Game(List<DivisibleRule> divisibleRules) {
		this.divisibleRules = divisibleRules; 
	}
	
	public String play(int number) {
		String message = "";
		for (DivisibleRule rule : divisibleRules) {
			message += rule.apply(number);
		}
		return message;
	}
}
