package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Radiobutton_Using_Methods1 {

	public static void main(String[] args)
	{
		
  //https://www.ecanarys.com/Blogs/ArticleID/225/Handling-Radio-buttons-and-Checkboxes-using-Selenium-Webdriver	
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		driver.get("https://www.facebook.com/");
		
		WebElement femaleradiobutton=driver.findElement(By.id("u_0_9"));
		
		//Checking if the Female radio button is Displayed on the webpage status
		boolean femaleBtnisDisplayed=femaleradiobutton.isDisplayed();
		System.out.println("Is Female Button is Displayed => "+femaleBtnisDisplayed);
	    
		//Checking if the Female radio button is Enable on the webpage status
		boolean  femaleBtnisEnabled=femaleradiobutton.isEnabled();
		System.out.println("Is Female Button is Enabled  =>  "+femaleBtnisEnabled);
		
		//Checking if the Female button Selection Status
		boolean femaleBtnisSelected=femaleradiobutton.isSelected();
		System.out.println("Is Female Button is Selected =>  "+femaleBtnisSelected);
		
		//Select Female Radio Button
		femaleradiobutton.click();
		
		//Rechecking the Status of the Female Button Status
		boolean femaleBtnNewStatus=femaleradiobutton.isSelected();
		System.out.println("Female Radio button status after Perform Click() Event => "+femaleBtnNewStatus);
		 
	    driver.close();
	}

}
