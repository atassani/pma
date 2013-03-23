package com.pimpam.test.game.divisible;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.pimpam.game.Rule;
import com.pimpam.game.divisible.DivisibleRule;

public class TestDivisibleRule {

	private static final String IRRELEVANT_MESSAGE = "message";
	private static final int IRRELEVANT_DIVISOR = 3;
	private static final int IRRELEVANT_DIVISIBLE = 3;
	private static final int IRRELEVANT_NON_DIVISIBLE = 1;
	private Rule divisibleRule;

	@Before
	public void init() {
		divisibleRule = new DivisibleRule(IRRELEVANT_DIVISOR, IRRELEVANT_MESSAGE); 
	}
	
	@Test
	public void whenInputDivisibleReturnsMessage() {
		Assert.assertEquals(IRRELEVANT_MESSAGE, divisibleRule.apply(IRRELEVANT_DIVISIBLE));
	}
	
	@Test
	public void whenInputNonDivisibleReturnsBlank() {
		Assert.assertEquals("", divisibleRule.apply(IRRELEVANT_NON_DIVISIBLE));
	}
	
	@Test
	public void whenInputMultipleOfDivisibleNumberReturnsMessage() {
		Assert.assertEquals(IRRELEVANT_MESSAGE, divisibleRule.apply(IRRELEVANT_DIVISIBLE*2));
	}

}
