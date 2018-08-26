package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Radiobuttons_Facebook {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.name("sex")).click();
		driver.findElement(By.id("u_0_a")).click();
		
		if (driver.findElement(By.id("u_0_a")).isSelected()) 
		{
			System.out.println("TEST PASS");
			
		} else
		{
			System.out.println("TEST FAIL");
		}
		
		driver.close();	
	}
}
