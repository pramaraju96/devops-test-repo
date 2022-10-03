package com.msn.junit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTestFour {

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
	public void junitFourTest1() {
		System.out.println("Inside junitfourtest1");
	}
	@Test
	public void junitFourTest2() {
		System.out.println("Inside junitfourtest2");
	}
	@Test
	public void junitFourTest3() {
		System.out.println("Inside junitfourtest3");
	}

}
