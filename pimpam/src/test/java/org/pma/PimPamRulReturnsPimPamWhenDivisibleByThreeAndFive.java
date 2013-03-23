package org.pma;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class PimPamRulReturnsPimPamWhenDivisibleByThreeAndFive {
	private Game pimPam;

	@Before
	public void init() {
		List<DivisibleRule> divisibleRules;
		divisibleRules = new ArrayList<DivisibleRule>();
		divisibleRules.add(new DivisibleRule(3, "Pim")); 
		divisibleRules.add(new DivisibleRule(5, "Pam"));
		pimPam = new Game(divisibleRules);
	}
	
	@Test
	public void whenFifteenReturnPimPam() {
		Assert.assertEquals("PimPam", pimPam.play(15));
	}
}
