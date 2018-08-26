package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Handling_HtmlUnitDriver_HeadlessBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		//HtmlUnitDriver is not available in selenium 3.x version
		//HtmlUnitDriver - to use this concept wee have to download HtmlUnitDriver jar file 
		//and associate to our project
		
	   //https://github.com/SeleniumHQ/htmlunit-driver/releases -> download  Jar file link
		
		//Advantages of HtmlUnitDriver
		   //1. No browser is launched
		   //2. Very fast - performance of the script
		   //3.Not suitable for Actions class, movetoElement, doubleclick, drag and drop
		 
		  //HtmlUnitDriver also called as Ghost Driver or Headless Browser. 
		  //There are several Headless Browser are there in market like
		     //1.--HtmlUnitDriver ->Java
		     //2.--PhontomJs  -->Javascript
		  
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new HtmlUnitDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
		String beforetitle=driver.getTitle();
		System.out.println("Before Title is "+beforetitle);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("gopikamma");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gopikamma");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		String aftertitle=driver.getTitle();
		System.out.println("After login title is "+aftertitle);
		driver.close(); 
	}
}
