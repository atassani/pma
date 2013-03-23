package org.pma;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class PumRuleReturnsPumWhenDivisibleByTwo {

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
	@Ignore(value="Until defined by business")
	public void whenTwoReturnPum() {
		Assert.assertEquals("Pum", game.play(2));
	}
}
