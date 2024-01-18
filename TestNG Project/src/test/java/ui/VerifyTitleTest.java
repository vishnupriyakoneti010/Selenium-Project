package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	
	@Test
	public void titleTest() {
		SoftAssert softassert = new SoftAssert();
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedtext = "Search";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		softassert.assertEquals(actualtitle, expectedtitle, "Title verification is failed");
		String actualtext  = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification is failed");//Message will be printed only if it fails.
		softassert.assertAll();
		driver.close();		
	}
}

//Hard Assertion: If there are 3 testcases in a class and first test got failed, execution will stop right there and dont go to next textcases for validation.
//Soft Assertion: If there are 3 testcases in a class and first test got failed, it records failes testcase and continue execution until all tests are completed.
