package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollAndClickCheckbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://get.sugarcrm.com/au/watch-demo/");
		driver.manage().window().maximize();
		WebElement scroll = driver.findElement(By.xpath("//input[@type ='submit']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(scroll).perform();
		driver.findElement(By.id("doi0")).click();
		driver.close();
		

	}

}
