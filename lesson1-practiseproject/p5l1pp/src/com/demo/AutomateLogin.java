package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateLogin {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/seeyo/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://profile.oracle.com/");
		//email
		WebElement email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("ssousername")));
		email.sendKeys("seeyo2602@gmail.com");
		//password
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys("Seeyounicorn26");	
		//button
		WebElement login= driver.findElement(By.id("signin_button"));
		login.click();
	}

}
