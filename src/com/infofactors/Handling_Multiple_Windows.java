package com.infofactors;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.softmindinformatics.com/");
		driver.findElement(By.linkText("Emp Login")).click();
		
		Thread.sleep(2000);
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		
		String parentwindowId=it.next();
		System.out.println("Parent window id is "+parentwindowId);
		
		String childwindowId=it.next();
		System.out.println("Child window id is "+childwindowId);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(childwindowId);
		String childwindowtitle=driver.getTitle();
		System.out.println("Child window title is "+childwindowtitle);
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parentwindowId);
		String parentwindowtitle=driver.getTitle();
		System.out.println("Parent window title is "+parentwindowtitle);
		driver.quit();
	}

}
