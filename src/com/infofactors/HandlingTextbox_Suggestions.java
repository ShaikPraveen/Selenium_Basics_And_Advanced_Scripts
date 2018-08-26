package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTextbox_Suggestions
{
	public static void main(String[] args) 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://cleartrip.com");
		driver.findElement(By.id("FromTag")).sendKeys("che");
		
		
		List<WebElement> citynames= driver.findElements(By.xpath("html/body/ul[1]/li/a"));
		System.out.println(citynames.size());
		
		for (int i = 0; i <citynames.size() ; i++) 
		{
			System.out.println(citynames.get(i).getText());
					
		}
		 driver.close();
	}
}
