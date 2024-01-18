package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathANDandORoperator {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2Fn%2Ferror");
		driver.findElement(By.xpath("//input[@id='firstname' or @name = 'firstname']")).sendKeys("Vishnupriya");
		driver.findElement(By.xpath("//input[@id=\"lastname\" and @name = \"lastname\"]")).sendKeys("koneti");
		driver.close();
		
	}

}
