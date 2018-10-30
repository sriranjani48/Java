package automationFramework.Calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.By;

public class Calculator {

	WebDriver driver = new FirefoxDriver();
	String baseUrl = "https://www.calculator.net/";
	
	driver.navigate().to(baseUrl);
	
	driver.findElement(By.linkText("Time Calculator")).click();
}
