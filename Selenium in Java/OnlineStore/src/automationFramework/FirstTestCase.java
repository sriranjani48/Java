package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	
	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.20.1-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://leetcode.com");
		
		
		/*System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");*/
		
		driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.linkText("Login")).click();
	}

}
