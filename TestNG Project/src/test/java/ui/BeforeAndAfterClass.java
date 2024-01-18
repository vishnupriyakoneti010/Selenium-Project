package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BeforeAndAfterClass {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Runs before the class");
	}
	@AfterClass
	
	public void afterClass() {
		System.out.println("Runs after the class");
	}
	
	@Test
	public void aTest1() {
		System.out.println("test1");
	}

	@Test
	public void bTest2() {
		System.out.println("test2");
	}

}
