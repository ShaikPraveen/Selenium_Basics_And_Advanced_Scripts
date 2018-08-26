package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Total_Frames {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("gopikamma");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gopikamma");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	    List<WebElement> ele = driver.findElements(By.tagName("frame"));
	    System.out.println("Number of frames in a page :" + ele.size());
	    for(WebElement el : ele)
	    {
	      //Returns the Id of a frame.
	        System.out.println("Frame Id :" + el.getAttribute("id"));
	      //Returns the Name of a frame.
	        System.out.println("Frame name :" + el.getAttribute("name"));
	    }
	    driver.close();	
	}
}
