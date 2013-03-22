package org.pma;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class PimPamRulReturnsPimPamWhenDivisibleByThreeAndFive {
	private PimPam pimPam;

	@Before
	public void init() {
		pimPam = new PimPam();
	}
	
	@Test
	public void whenFifteenReturnPimPam() {
		Assert.assertEquals("PimPam", pimPam.play(15));
	}
}
