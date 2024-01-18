package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.ebay.com/"); 
		  WebElement dropdown = driver.findElement(By.name("_sacat")); Select select = new
		  Select(dropdown); select.selectByValue("2984");
		  select.selectByVisibleText("Cell Phones & Accessories");
		  select.deselectByIndex(5);
		  driver.close();
		

		/*
		 * //For multiSelection: 
		 * WebElement dropdown = driver.findElement(By.id("muti-select")); 
		 * Select select = new Select(dropdown); 
		 * select.selectByIndex(3);
		 * select.selectByValue("California"); 
		 * List<WebElement> allitems = select.getAllSelectedOptions(); 
		 * System.out.println(allitems.size());
		 * driver.close();
		 */

	}

}
