package com.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/seeyo/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.freecodecamp.org/news/what-is-an-iframe-html-example/");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		List<WebElement> frame= driver.findElements(By.tagName("iframe"));
		System.out.println("Total Number of iFrame Found: "+frame.size());
	}

}