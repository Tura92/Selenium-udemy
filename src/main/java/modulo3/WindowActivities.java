package modulo3;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//This wait for previous get to be completed
		driver.navigate().to("https://www.facebook.com");
		
		//Go back to previous page (Push back button)
		driver.navigate().back();
		
		//Go forward to next page (Push forward button)
		driver.navigate().forward();
	}
}
