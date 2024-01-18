package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleWindows {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"1666820637520_9ph\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		String childwindow = iterator.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		driver.switchTo().window(parentwindow);
		driver.findElement(By.name("UserFirstName")).sendKeys("Vishnupriya");
		driver.findElement(By.name("UserLastName")).sendKeys("Koneti");
		//Back to parent window
		driver.switchTo().window(parentwindow);
		//If we have multiple we can choose options in windows
		//driver.switchTo().Options.window();
		
		

}
}
