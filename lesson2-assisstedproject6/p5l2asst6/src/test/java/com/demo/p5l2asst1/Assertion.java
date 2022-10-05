package com.demo.p5l2asst1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	WebDriver driver=null;
	SoftAssert soft=null;
	Assertion hard=null;
  @Test
  public void TitleTest() {
	  
	  //testcase
	  driver.get("https://www.google.com/");
	  System.out.println(driver.getTitle());
	  
	  soft.assertEquals(driver.getTitle(), "Google");
	  soft.assertAll();
	  
	 // driver.close();
  }
 public void HardTest() {
	  
	  //testcase
	  driver.get("https://www.google.com/");
	  System.out.println(driver.getTitle());
	  
	  soft.assertEquals(driver.getTitle(), "Google");
	  soft.assertAll();
	  
	 // driver.close();
  }
@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/seeyo/Downloads/chromedriver");
		driver= new ChromeDriver();
		soft= new SoftAssert();
		hard = new Assertion();
	}
	@AfterMethod
	public void afterMethod() {
		//driver.close();
		driver=null;
	}
}