package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		WebElement radiobutton1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[1]/ul/li[2]"));
		WebElement radiobutton2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[1]/ul/li[3]"));
		radiobutton2.click();
		System.out.println(radiobutton1.isEnabled());
		System.out.println(radiobutton2.isEnabled());

}
}