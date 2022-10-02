package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		String path= "/Users/seeyo/Downloads/chromedriver";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		String url="https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Title:"+driver.getTitle());	
		WebElement email=driver.findElement(By.id("email"));
		System.out.println(email.getAttribute("placeholder"));
		email.sendKeys("seeyo2602@gmail.com");
		WebElement pass=driver.findElement(By.name("pass"));
		System.out.println(pass.getAttribute("placeholder"));
		pass.sendKeys("Femimma!1977");		
		WebElement login=driver.findElement(By.name("login"));
		login.submit();
			
	}
}
