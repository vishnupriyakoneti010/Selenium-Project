package ui;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationClass {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\browser driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\browser driver\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		//System.setProperty("webdriver.edge.driver","\"C:\\browser driver\\msedgedriver.exe");
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		
		driver.close();
		

	}

}
