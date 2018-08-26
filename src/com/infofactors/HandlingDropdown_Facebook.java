package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown_Facebook 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		/* Whenever we will handle dropdown we have to create Select class object
		 * SelectByVisibleTest deselectIndex()
		 * SelectByValue       deselectAll()
		 * SelectByIndex       
		 * getoptions()
		 */
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		driver.get("https://www.facebook.com/");
		Select sele=new Select(driver.findElement(By.id("month")));
		sele.selectByVisibleText("Jul");
		Thread.sleep(2000);
		sele.selectByIndex(3);//Mar
		Thread.sleep(2000);
		sele.selectByValue("5");//May it will return based value
	
	}

}
