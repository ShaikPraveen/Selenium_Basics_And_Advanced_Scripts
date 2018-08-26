package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Printing_Dropdown_Options_Erail {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		   driver.get("https://erail.in/");
		   Select sele=new Select(driver.findElement(By.id("cmbQuota")));
		   
		   WebElement option=sele.getFirstSelectedOption();
		   String defaultitem=option.getText();
		   System.out.println("Before selecting the Item is "+defaultitem);
		   
		   
		   sele.selectByVisibleText("Defence");
		   
		   WebElement option1=sele.getFirstSelectedOption();
		   String defaultitem1=option1.getText();
		   System.out.println("After Selecting the Value is  "+defaultitem1);
		   
	
		   sele.selectByIndex(3);
		   WebElement option2=sele.getFirstSelectedOption();
		   String defaultitem2= option2.getText();
		   System.out.println("After Selecting the Value is  "+defaultitem2);
		   
          driver.close(); 
	}

}
