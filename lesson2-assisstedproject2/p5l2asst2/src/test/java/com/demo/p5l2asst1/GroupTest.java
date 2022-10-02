package com.demo.p5l2asst1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupTest {
	
	WebDriver driver=null;
	
	 
	
	@Test(groups = "Chrome")
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "/Users/seeyo/Downloads/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(groups = "Chrome",dependsOnMethods = {"launchChrome"})
	public void loginWithChrome() {
		
		driver.findElement(By.id("email")).sendKeys("seeyo@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Leahnega@123");
		driver.findElement(By.name("login")).submit();
		//driver.close();
	}
	
	@Test(groups = "Firefox")
	public void launchFireFox() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/seeyo/Downloads/geckodriver");
		driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(groups = "Firefox",dependsOnMethods = {"launchFireFox"})
	public void  loginWithFireFox() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		email.sendKeys("seeyo@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Leahnega@123");
		driver.findElement(By.name("login")).submit();
	}
  
}
