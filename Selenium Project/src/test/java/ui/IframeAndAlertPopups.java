package ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeAndAlertPopups {
	public static void main (String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		//Frame by Index
		driver.switchTo().frame(0);
		//Frame by String(name or ID):
		driver.switchTo().frame("iframeResult");
		//Frame by WebElement
		WebElement frame1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/button")).click();
		//Handling alert by SendKeys
		Alert alertonpage = driver.switchTo().alert();
		alertonpage.sendKeys("Vishnupriya");
		String alertText = alertonpage.getText();
		System.out.println(alertText);
		// Handling the Alert Pop-up
		alertonpage.accept();
		// Going back to the Parent frame
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		
	}

}
