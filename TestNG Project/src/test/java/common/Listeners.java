package common;


import org.testng.ITestListener;

import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test case is starting");
		
	}
	public void OnTestSuccess(ITestResult result) {
		System.out.println("Test case is success");
	}
	public void OnTestFailure(ITestResult result) {
		System.out.println("Testcase is failed");
	}
	public void OnTestSkipped(ITestResult result) {
		System.out.println("Testcase is Skipped");
	}

}
