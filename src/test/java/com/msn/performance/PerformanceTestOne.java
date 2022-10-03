package com.msn.performance;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PerformanceTestOne {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void perfTest1() {
		System.out.println("Inside perftest1");
	}
	@Test
	public void perfTest2() {
		System.out.println("Inside perftest2");
	}
	@Test
	public void perfTest3() {
		System.out.println("Inside perftest3");
	}

}
