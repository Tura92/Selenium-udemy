package modulo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntro {
	public static void main(String[] args) {
		
		//Invoke the browser
		//Chrome - ChromeDriver -> Methods
		//step to invoke Chrome driver
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Firefox launch
		//geckodriver
		//System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Edge launch
		System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentUrl);
		driver.getPageSource();
		driver.close();
		
		
	}
}
