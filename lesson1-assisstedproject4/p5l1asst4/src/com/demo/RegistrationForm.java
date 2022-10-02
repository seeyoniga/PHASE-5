package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/seeyo/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		//name
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("seeyoniga prince");
		//email
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("seeyocrazy26@icloud.com");
		//mobile
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9940616500");
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Seeyo@123");		
		//button
		WebElement register= driver.findElement(By.cssSelector("#registerButton"));
		register.click();		
	}

}