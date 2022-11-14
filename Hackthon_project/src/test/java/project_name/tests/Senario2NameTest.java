package project_name.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Senario2NameTest {

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@BeforeMethod
	public void beforeMethodTest() {
		System.out.println("B M");
	}

	@Test
	public void test() {
		System.out.println("Test");

	}

	@Test
	public void test1() {
		System.out.println("Test 1");

	}

	@Test
	public void test2() {
		System.out.println("Test 2");

	}

	@Test
	public void test3() {
		System.out.println("Test 3");

	}

	@AfterMethod
	public void afterMethodTest() {
		System.out.println("A M");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}
}
