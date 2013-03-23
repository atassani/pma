package com.pimpam.game;

import java.util.List;

public class Game {
	List<Rule> rules;
	
	public Game(List<Rule> rules) {
		this.rules = rules; 
	}
	
	public String play(int number) {
		String message = "";
		for (Rule rule : rules) {
			message += rule.apply(number);
		}
		return message;
	}
}
