package org.pma;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class PimRuleReturnsPimWhenDivisibleByThree {

	private PimPam pimPam;

	@Before
	public void init() {
		pimPam = new PimPam();
	}

	@Test
	public void whenThreeReturnPim() {
		Assert.assertEquals("Pim", pimPam.play(3));
	}
	
	@Test
	public void whenTwoReturnBlank() {
		Assert.assertEquals("", pimPam.play(2));
	}
	
	@Test
	public void whenSixReturnPim() {
		Assert.assertEquals("Pim", pimPam.play(6));
	}
}
