package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTextbox_TsRtc_Suggestion {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.tsrtconline.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).clear();
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("kada");
		
		List<WebElement> busnames=driver.findElements(By.xpath("html/body/ul[1]/li/a"));
		System.out.println(busnames.size());
		
		for (int i = 0; i < busnames.size(); i++)
		{
			System.out.println(busnames.get(i).getText());
			
		}
		
		driver.close();
	}

}
