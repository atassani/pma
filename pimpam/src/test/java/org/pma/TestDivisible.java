package org.pma;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TestDivisible {

	private static final String IRRELEVANT_MESSAGE = "message";
	private static final int IRRELEVANT_DIVISOR = 3;
	private static final int IRRELEVANT_DIVISIBLE = 3;
	private static final int IRRELEVANT_NON_DIVISIBLE = 1;
	private DivisibleRule divisibleRule;

	@Before
	public void init() {
		divisibleRule = new DivisibleRule(IRRELEVANT_DIVISOR, IRRELEVANT_MESSAGE); 
	}
	
	@Test
	public void whenInputDivisibleByThreeReturnsMessage() {
		Assert.assertEquals(IRRELEVANT_MESSAGE, divisibleRule.apply(IRRELEVANT_DIVISIBLE));
	}
	
	@Test
	public void whenInputNotDivisibleByThreeReturnsBlank() {
		Assert.assertEquals("", divisibleRule.apply(IRRELEVANT_NON_DIVISIBLE));
	}

}
