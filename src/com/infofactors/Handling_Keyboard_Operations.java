package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Handling_Keyboard_Operations 
{
	 public static WebDriver driver;
	
	@Test
	public void gmailkeyboardTest() throws InterruptedException 
	{
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		driver.get("https://www.google.com/?gws_rd=ssl");
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.linkText("Gmail")));
		Thread.sleep(3000);
		act.contextClick();
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		driver.close();
	}

}
