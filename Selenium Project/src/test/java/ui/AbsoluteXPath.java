package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbsoluteXPath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/section[2]/div/dw-de-signup-form//form/dx-input[1]//div[1]/div/input"));
		driver.close();
}
}
