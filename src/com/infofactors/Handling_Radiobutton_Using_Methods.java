package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Radiobutton_Using_Methods {

	public static void main(String[] args)
	{
		
  //https://www.ecanarys.com/Blogs/ArticleID/225/Handling-Radio-buttons-and-Checkboxes-using-Selenium-Webdriver	
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		driver.get("https://www.facebook.com/");
		
		WebElement maleradiobutton=driver.findElement(By.id("u_0_a"));
		
	   //Checking if the Male Radio button is displayed on the Webpage and printing the status
		boolean radioBtnisDisplayed=maleradiobutton.isDisplayed();
		System.out.println("Is Male radio Button is Displayed => "+radioBtnisDisplayed);
	
	  //Checking if the Male Radio button is enabled on the webpage and printing the status
		boolean radioBtnisEnabled= maleradiobutton.isEnabled();
		System.out.println("Is Male Radio Button is Enabled => "+radioBtnisEnabled );
		
	  //Checking the default radio button selection status
		boolean radioBtnisSelected=maleradiobutton.isSelected();
		System.out.println("Is male Radio Button is Selected => "+radioBtnisSelected);
		
		//Selecting the Male Radio Button
		  maleradiobutton.click();
		  
	 //rechecking the male radio button selection status and printing it..
		boolean radioBtnNewSelectionStatus= maleradiobutton.isSelected();
		System.out.println("Male radio Selection status after perform click() event => "+radioBtnNewSelectionStatus);
		 
	   driver.close();

	}

}
