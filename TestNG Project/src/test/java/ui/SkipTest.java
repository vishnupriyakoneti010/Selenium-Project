package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {
	Boolean datasetup = true;
	
	@Test(enabled = false)
	public void skipTest1() {
		System.out.println("This  is a skip testcase as it is not completed yet");
		
	}
	
	@Test(enabled = false)
	public void skipTest2() {
		System.out.println("Skipping this test, forcefully");
		throw new SkipException("Skipping this testcase");
		
	}
	
	@Test(enabled = false)
	public void skipTest3() {
		System.out.println("Skipping this testcase based on a condition");
		if (datasetup= true){
			System.out.println("Execute the testcases");
		}
		else {
			System.out.println("Do not execute the testcases");
			throw new SkipException("Do not execute testcases further");
		}
		
	}

}

/*
 * There are 3 types to skip the testcases 1. Using enable=false, 2.Skipping
 * testcase forcefully using exception, 3. Using if else statement.
 */
