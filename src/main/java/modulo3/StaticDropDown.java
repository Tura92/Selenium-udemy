package modulo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		String op = dropdown.getFirstSelectedOption().getText();
		System.out.println(op);
		
		dropdown.selectByVisibleText("AED");
		String op2 = dropdown.getFirstSelectedOption().getText();
		System.out.println(op2);
		
		dropdown.selectByValue("INR");
		String op3 = dropdown.getFirstSelectedOption().getText();
		System.out.println(op3);
		
		//--------------------------------
		
		
	}
}
