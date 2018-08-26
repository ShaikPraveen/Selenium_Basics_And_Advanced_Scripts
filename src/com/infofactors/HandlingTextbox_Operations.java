package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTextbox_Operations 
{
   public static void main(String[] args) {
	
	   //1.Enter the data
	   //2.Clear the data
	   //3.Retrieve the data
	   
	    WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://sg2plcpnl0031.prod.sin2.secureserver.net:2096/");
		//driver.findElement(By.linkText("Emp Login")).click();
		
		driver.findElement(By.id("user")).clear();
		driver.findElement(By.id("user")).sendKeys("test123@gmail.com");
		driver.findElement(By.id("user")).clear();
		driver.findElement(By.id("user")).sendKeys("test123@gmail.com");
		
		String entervalue=driver.findElement(By.id("user")).getAttribute("value");
		System.out.println(entervalue);
		
		driver.close();   
}

}
