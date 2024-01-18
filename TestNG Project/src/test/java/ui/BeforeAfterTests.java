package ui;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTests {

	@BeforeTest
	public void loginToApplication() {
		System.out.println("Login to application is successfull");
	}

	@AfterTest
	public void logoutFromApplication() {
		System.out.println("Logout from application is successfull");
	}

	@Test(priority = 1, description = "This is login test")
	public void bloginTest() {
		System.out.println("Login is successfull");
	}

	@Test(priority = 2, description = "This is logout test")
	public void alogoutTest() {
		System.out.println("Logout is successfull");
	}

}
