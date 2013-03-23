package org.pma;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class PamRuleReturnsPamWhenDivisibleByFive {

	private Game game;

	@Before
	public void init() {
		List<DivisibleRule> divisibleRules;
		divisibleRules = new ArrayList<DivisibleRule>();
		divisibleRules.add(new DivisibleRule(3, "Pim")); 
		divisibleRules.add(new DivisibleRule(5, "Pam"));
		game = new Game(divisibleRules);
	}
	
	@Test
	public void whenFiveReturnPim() {
		Assert.assertEquals("Pam", game.play(5));
	}

	@Test
	public void whenTenReturnPim() {
		Assert.assertEquals("Pam", game.play(25));
	}
}
