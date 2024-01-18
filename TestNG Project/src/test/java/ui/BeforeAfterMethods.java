package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterMethods {

	@BeforeTest
	public void loginToApplication() {
		System.out.println("Login to application is successfull");
	}

	@AfterTest
	public void logoutFromApplication() {
		System.out.println("Logout from application is successfull");
	}
	
	@BeforeMethod
	public void connectToDB() {
		System.out.println("DB is connected");
	}
	
	@AfterMethod
	public void disconnectFromDB() {
		System.out.println("DB is disconnected");
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

//Before and After methods execute for every Method 
//Console: Login to application is successfull
//           DB is connected
//           Login is successfull
//           DB is disconnected
//           DB is connected
//           Logout is successfull
//           DB is disconnected
//           Logout from application is successfull