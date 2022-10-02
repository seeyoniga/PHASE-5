package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebElements {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/seeyo/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com/");
		WebElement email_id= driver.findElement(By.id("email"));
		WebElement email_xpath=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		System.out.println("Email by Xpath and Id :"+email_id.equals(email_xpath));
		WebElement email_full_xpath=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		System.out.println("Email by Xpath and Full Xpath: "+email_full_xpath.equals(email_xpath));
		WebElement email_cssSelector=driver.findElement(By.cssSelector("#email"));
		System.out.println("Email By CSS Selector and Xpath is: "+email_cssSelector.equals(email_xpath));
		List<WebElement> list=driver.findElements(By.cssSelector("input.inputtext"));		
		for(WebElement e:list) {
			System.out.println("List of WebElements : "+e.getAttribute("placeholder"));
		}
		WebElement password= driver.findElement(By.cssSelector("input[name=pass]"));
		System.out.println("Password using Tag: "+password.getAttribute("placeholder"));
		driver.close();
		
	}

}
