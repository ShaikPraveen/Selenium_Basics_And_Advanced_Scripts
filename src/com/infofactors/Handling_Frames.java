package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Frames 
{
	public static void main(String[] args) throws InterruptedException {
		
	//What is Frame  -> Frame is another webelement it has different elements
    //Whenever we will handle the frame we have to switch the frame based on index position
    //How to handle an element inside the Frame?
		//1. Switch to Frames by index
		//2. Switch to Frames by Name
		//3. Switch to Frames by ID
 
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
	    
	    Thread.sleep(2000);
	    driver.switchTo().frame("mainpanel");
	    driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();
	    driver.close();
	}

}
