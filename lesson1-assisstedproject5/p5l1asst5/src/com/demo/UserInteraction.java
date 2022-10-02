package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UserInteraction {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/seeyo/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		WebElement username= driver.findElement(By.id("email"));	
		Actions builder= new Actions(driver);
		Action seriesOfAction=builder
				.moveToElement(username)
				.click()
				.keyDown(username,Keys.SHIFT)
				.sendKeys(username,"hello")
				.doubleClick(username)
				.contextClick()
				.build();		
		seriesOfAction.perform();		
		
	}

}