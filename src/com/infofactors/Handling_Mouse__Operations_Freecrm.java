package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Mouse__Operations_Freecrm
{ 
	public static void main(String[] args) throws InterruptedException 
	{
		//Selenium webdriver provide Action class to perform Mouse and Keyboard operations
		//this class provided some built in methods like moveToElement(), Build(), Perform(), click(), and SendKeys() methods
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://freecrm.com");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("gopikamma");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gopikamma");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		driver.switchTo().frame("mainpanel");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("CALENDAR")));
		
		act.build().perform();
		driver.findElement(By.linkText("Month View")).click();
		
		
		List<WebElement> alllinks=driver.findElements(By.xpath("html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[2]/ul/li/a"));
		System.out.println("Number of Links are "+alllinks.size());
				
		driver.close();
	}

}
