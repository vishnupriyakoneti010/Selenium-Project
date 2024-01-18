package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathStartsWithAndContains {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2Fn%2Ferror");
		driver.findElement(By.xpath("//input[starts-with(@id,'first')]"));
		driver.findElement(By.xpath("//input[contains(@name,\"Email\")]"));
		driver.close();
	}

}
