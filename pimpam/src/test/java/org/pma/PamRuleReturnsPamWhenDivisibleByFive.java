package org.pma;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class PamRuleReturnsPamWhenDivisibleByFive {

	private PimPam pimPam;

	@Before
	public void init() {
		pimPam = new PimPam();
	}
	
	@Test
	public void whenFiveReturnPim() {
		Assert.assertEquals("Pam", pimPam.play(5));
	}

	@Test
	public void whenTenReturnPim() {
		Assert.assertEquals("Pam", pimPam.play(10));
	}
}
