package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Checkbox_Using_Methods {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		driver.get("file:///C:/Users/admin/Desktop/mycheckbox.html/");
		
		WebElement bikecheckbox=driver.findElement(By.xpath("//input[@value='Bike']"));
		
	    //Checking the Check Box is Displayed on the webpage 
		boolean bikecheckBoxisDisplayed=bikecheckbox.isDisplayed();
		System.out.println("Is Bike Check Box is Displayed on the Webpage =>"+bikecheckBoxisDisplayed);
		
		//Checking the Check Box is Enabled on the webpage 
	     boolean bikecheckBoxisEnabled=bikecheckbox.isEnabled();
		 System.out.println("Is Bike Check Box is Enabled on the Webpage =>"+bikecheckBoxisEnabled);
		 
		 
		//Checking the Check Box is Selection status on the webpage 
	     boolean bikecheckBoxisSelected=bikecheckbox.isSelected();
		 System.out.println("Is Bike Check Box is Selected on the Webpage =>"+bikecheckBoxisSelected);
	
		//Selecting the Bike checkbox
		 bikecheckbox.click();
		 
        //Rechecking the Bike Checkbox Selection Status
		 boolean bikecheckboxNewStatus=bikecheckbox.isSelected();
		 System.out.println("Bike Check Box Status After Perform Click() Operation =>"+bikecheckboxNewStatus);
		 
		 driver.close();
	}

}
