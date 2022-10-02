package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeOuts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/seeyo/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);		
		driver.get("http://www.facebook.com/");
		WebDriverWait explicitwait=new WebDriverWait(driver, 10);
		explicitwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("email")));
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("seeyo2602@gmail.com");
				
				 
	}
}