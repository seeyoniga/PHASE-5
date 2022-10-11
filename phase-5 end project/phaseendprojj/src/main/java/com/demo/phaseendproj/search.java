package com.demo.phaseendproj;

import java.io.IOException;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class search {
	public static void main(String[] args) throws IOException,InterruptedException {
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver","/Users/seeyo/Downloads/chromedriver");
			driver= new ChromeDriver();		  
		    WebDriverWait wait = new WebDriverWait(driver, 10);
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			StopWatch pageLoad = new StopWatch();
			pageLoad.start();
			//user name
			WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(1) > input")));
			username.sendKeys("6379583641");
			//password
			WebElement password = driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(2) > input"));
			password.sendKeys("Seeyounicorn26");
			//login button
			WebElement loginbutton = driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div._1D1L_j > button"));
			loginbutton.click(); 
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//search
			WebElement search = driver.findElement(By.name("q"));
			search.sendKeys("Iphone 13");
			//button
			WebElement button = driver.findElement(By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._1cmsER > form > div > button"));
			button.click();	
			//verify scroll bar
			String execScript = "return document.documentElement.scrollHeight>document.documentElement.clientHeight;";
			JavascriptExecutor scrollBarPresent = (JavascriptExecutor) driver;
			Boolean test = (Boolean) (scrollBarPresent.executeScript(execScript));
			if (test == true) {
				System.out.println("Scrollbar is present.");
			} else if (test == false){
				System.out.println("Scrollbar is not present.");
			}
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//image gets downloaded just when the user scrolls
			StopWatch imageLoad = new StopWatch();
		    imageLoad.start();
			WebElement element= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[5]/div/div/div/a/div[2]/div[1]/div[1]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
			int ih = element.getSize().getHeight(); 
			Dimension currentDimension = driver.manage().window().getSize();
			int height = currentDimension.getHeight();
			System.out.println(element.getText());
			imageLoad.stop();
			long imageLoadTime_ms = imageLoad.getTime();
		    System.out.println("Image is downloaded and displayed just as the user scrolled to its position");
		    System.out.println("Image Load time is " + imageLoadTime_ms + " milliseconds");
		    if(ih<=height) {
				System.out.println("Image is loaded and visible till the screen height only");
			}
		    else {
		    	System.out.println("Image is not loaded and visible till the screen height exactly");
		    }
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//scroll till bottom of the page
		    try {
		        Object lastHeight = ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

		        while (true) {
		            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
		            Thread.sleep(2000);

		            Object newHeight = ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
		            if (newHeight.equals(lastHeight)) {
		                break;
		            }
		            lastHeight = newHeight;
		        }
		        System.out.println("Scrollbar scrolled to the bottom of the page");
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
			pageLoad.stop();
	      //Get the time
	      long pageLoadTime_ms = pageLoad.getTime();
	      long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
	      System.out.println("Total Page Load Time in milliseconds : " + pageLoadTime_ms + " milliseconds");
	      System.out.println("Total Page Load Time in seconds : " + pageLoadTime_Seconds + " seconds");
	}
		
}

	