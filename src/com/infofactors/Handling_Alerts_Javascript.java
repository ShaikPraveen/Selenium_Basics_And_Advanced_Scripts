package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Alerts_Javascript {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//driver.findElement(By.id("login1")).sendKeys("Admin");
		//driver.findElement(By.id("password")).sendKeys("Admin");
		driver.findElement(By.name("proceed")).click();
		
		Alert alt=driver.switchTo().alert();
		String altText=alt.getText();
		System.out.println("Alert text is =>"+altText);
		
		if (altText.equalsIgnoreCase("Please enter a valid user name")) 
		{
			System.out.println("TEST PASS => "+altText+" <=is Correct");
			
		} else
		{
			System.out.println("TEST FAIL => "+altText+" <=is Incorrect");
		}
		
		alt.accept();// Means Ok 
	    //alt.dismiss();// Means Cancel 
		driver.close(); 
	}
}
