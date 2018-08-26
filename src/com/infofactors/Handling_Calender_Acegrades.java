package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Calender_Acegrades {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://dev.internal.acegrades.com");
		driver.findElement(By.linkText("LOG IN")).click();
		
		
		driver.findElement(By.id("email")).sendKeys("b.sc.praveen@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginId")).click();
		
	    Thread.sleep(2000);
	      
	     driver.findElement(By.id("cratenew_id")).click();
	     
	     Thread.sleep(2000);
		
		 driver.findElement(By.id("duedate_id")).click();;
		 
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("document.getElementById('duedate_id').value='10/10/2019'");
	     //driver.close();
	}
}
