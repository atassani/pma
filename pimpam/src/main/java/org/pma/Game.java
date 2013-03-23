package org.pma;

import java.util.ArrayList;
import java.util.List;

public class Game {
	List<DivisibleRule> divisibleRules;
	
	public Game() {
		divisibleRules = new ArrayList<DivisibleRule>();
		divisibleRules.add(new DivisibleRule(3, "Pim")); 
		divisibleRules.add(new DivisibleRule(5, "Pam")); 
	}
	
	public String play(int number) {
		String message = "";
		for (DivisibleRule rule : divisibleRules) {
			message += rule.apply(number);
		}
		return message;
	}
}
