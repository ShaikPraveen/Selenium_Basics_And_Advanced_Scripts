package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Handling_Mouse_Operations 
{

	  public static WebDriver driver;
	
	   @Test
	   public void way2automationTest() 
	   {
		    driver=new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
			driver.get("http://www.way2automation.com/");
			
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.linkText("COURSES"))).build().perform();
			
			driver.findElement(By.linkText("Jmeter")).click();
			driver.close();
	   }

}
