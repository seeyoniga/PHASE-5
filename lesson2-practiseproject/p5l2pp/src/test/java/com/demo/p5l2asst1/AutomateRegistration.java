package com.demo.p5l2asst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomateRegistration {
	String path= "/Users/seeyo/Downloads/chromedriver";
	public WebDriver driver;
  @Test
  public void f() {
	    WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		//email
		WebElement email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sView1:r1:0:email::content")));
		email.sendKeys("seeyo2602@gmail.com");
		//password
		WebElement password= driver.findElement(By.id("sView1:r1:0:password::content"));
		password.sendKeys("Leahnega@123");	
		//confirm password
		WebElement passwordd= driver.findElement(By.id("sView1:r1:0:retypePassword::content"));
		passwordd.sendKeys("Leahnega@123");
		//country
		WebElement country= driver.findElement(By.id("sView1:r1:0:country::content"));
		country.sendKeys("India");
		//first name
		WebElement firstname= driver.findElement(By.id("sView1:r1:0:firstName::content"));
		firstname.sendKeys("Seeyoniga");
		//last name
		WebElement lastname= driver.findElement(By.id("sView1:r1:0:lastName::content"));
		lastname.sendKeys("Prince");
		//job title
		WebElement jt= driver.findElement(By.id("sView1:r1:0:jobTitle::content"));
		jt.sendKeys("Student");
		//work phone
		WebElement wp= driver.findElement(By.id("sView1:r1:0:workPhone::content"));
		wp.sendKeys("9940616500");
		//company name
		WebElement cname= driver.findElement(By.id("sView1:r1:0:companyName::content"));
		cname.sendKeys("xxxxxx");
		//address 1
		WebElement add1= driver.findElement(By.id("sView1:r1:0:address1::content"));
		add1.sendKeys("no 32 vadugu street");
		//address 2
		WebElement add2= driver.findElement(By.id("sView1:r1:0:address2::content"));
		add2.sendKeys("mylapore");
		//city
		WebElement city= driver.findElement(By.id("sView1:r1:0:city::content"));
		city.sendKeys("chennai");
		//state
		WebElement state= driver.findElement(By.id("sView1:r1:0:state::content"));
		state.sendKeys("Tamil Nadu");
		//postal code
		WebElement pc= driver.findElement(By.id("sView1:r1:0:postalCode::content"));
		pc.sendKeys("600004");
		WebDriverWait wait10 = new WebDriverWait(driver, 10);
		//button
		WebElement register= wait10.until(ExpectedConditions.elementToBeClickable(By.id("sView1:r1:0:b1")));
		register.click();
  }
  @BeforeTest
  public void beforeTest() {
	  
		System.setProperty("webdriver.chrome.driver", "/Users/seeyo/Downloads/chromedriver");
		driver= new ChromeDriver();
  
  }
  @BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
  @BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
  @BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
  @AfterTest
	  public void afterTest() {
		 System.out.println("After test is running");
	  }
  @AfterMethod
		public void afterMethod() {
			System.out.println("After Method");
		}
		
  @AfterClass
		public void afterClass() {
			System.out.println("After Class ");
		}
		
  @AfterSuite
		public void afterSuite() {
			System.out.println("After Suite");
		}
}
