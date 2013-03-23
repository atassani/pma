package org.pma;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class PamRuleReturnsPamWhenDivisibleByFive {

	private Game pimPam;

	@Before
	public void init() {
		pimPam = new Game();
	}
	
	@Test
	public void whenFiveReturnPim() {
		Assert.assertEquals("Pam", pimPam.play(5));
	}

	@Test
	public void whenTenReturnPim() {
		Assert.assertEquals("Pam", pimPam.play(25));
	}
}
