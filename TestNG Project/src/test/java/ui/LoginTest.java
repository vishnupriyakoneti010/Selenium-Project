package ui;



import org.testng.annotations.Test;

public class LoginTest {
	

	@Test(priority = 1, description = "This is login test")
	public void bloginTest() {
		System.out.println("Login is successfull");
	}

	@Test(priority = 2, description = "This is logout test")
	public void alogoutTest() {
		System.out.println("Logout is successfull");
	}

}
