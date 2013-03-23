package org.pma;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class PimRuleReturnsPimWhenDivisibleByThree {

	private Game pimPam;

	@Before
	public void init() {
		pimPam = new Game();
	}

	@Test
	public void whenThreeReturnPim() {
		Assert.assertEquals("Pim", pimPam.play(3));
	}
	
	@Test
	public void whenTwoReturnBlank() {
		Assert.assertEquals("", pimPam.play(1));
	}
	
	@Test
	public void whenSixReturnPim() {
		Assert.assertEquals("Pim", pimPam.play(9));
	}
}
