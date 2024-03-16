package modulo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		String passengersCount1 = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(passengersCount1);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		clickNtimes(driver, By.id("hrefIncAdt"), 5);
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		String passengersCount2 = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(passengersCount2);
		
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		WebElement seniorDiscountCB = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		
		seniorDiscountCB.click();
		
		System.out.println(seniorDiscountCB.isSelected());
		
		int numberOfCheckboxes = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		
		System.out.println("Number of Checkboxes: " + numberOfCheckboxes);
	}
	
	//Method to click n times on the button
	public static void clickNtimes(WebDriver driver, By locator, int n) {
		for (int i = 0; i < n; i++) {
			driver.findElement(locator).click();
		}
	}
}
