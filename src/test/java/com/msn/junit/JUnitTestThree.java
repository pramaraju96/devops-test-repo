package com.msn.junit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTestThree {

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
	public void junitThreeTest1() {
		System.out.println("Inside junitthreetest1");
	}
	@Test
	public void junitThreeTest2() {
		System.out.println("Inside junitthreetest2");
	}
	@Test
	public void junitThreeTest3() {
		System.out.println("Inside junitthreetest3");
	}

}
