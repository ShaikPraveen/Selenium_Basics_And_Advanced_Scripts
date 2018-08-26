package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_Explicit_Wait
{
	
	public static void main(String[] args) 
	{
		//Implicit way is  -> Static wait
	    //Explicit wait is -> Dynamic wait
		//Explicit wait is for Specific element only not only all elements
		
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://dev.internal.acegrades.com");
		
		clickOn(driver, driver.findElement(By.linkText("LOG IN")),20 );
		driver.close();
	}
	
     public static void clickOn(WebDriver driver, WebElement locator, int timeout)
     {
    	 new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
    	 locator.click();
     }   
}
