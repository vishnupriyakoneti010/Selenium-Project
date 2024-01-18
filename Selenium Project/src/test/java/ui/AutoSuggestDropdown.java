package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text() = 'From']"));
		WebElement fromjourney = driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
		fromjourney.sendKeys("Sydney");
		fromjourney.sendKeys(Keys.ARROW_DOWN);
		fromjourney.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[text() = \"To\"]"));
		WebElement tojourney = driver.findElement(By.xpath("//input[@placeholder = \"To\"]"));
		tojourney.sendKeys("London");
		tojourney.sendKeys(Keys.ARROW_DOWN);
		tojourney.sendKeys(Keys.ENTER);
		driver.close();
			
	}

}
