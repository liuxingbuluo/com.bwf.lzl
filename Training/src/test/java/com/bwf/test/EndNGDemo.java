package com.bwf.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class EndNGDemo {
	@Test
	public void testfunc1() {
		assertEquals(1, 2);
	}
	@Test
	public void testfunc2() {
		assertEquals(1, 1);
	}
}
