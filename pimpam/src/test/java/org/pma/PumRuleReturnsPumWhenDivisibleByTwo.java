package org.pma;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class PumRuleReturnsPumWhenDivisibleByTwo {

	private Game pimPam;

	@Before
	public void init() {
		pimPam = new Game();
	}

	@Test
	@Ignore(value="Until defined by business")
	public void whenTwoReturnPum() {
		Assert.assertEquals("Pum", pimPam.play(2));
	}
}
