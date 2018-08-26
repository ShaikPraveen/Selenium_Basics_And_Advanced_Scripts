package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Printing_Dropdown_Options_Facebook {

	public static void main(String[] args) 
	{
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		//Printing Default value From Facebook Month Drop down
		
	    Select sele=new Select(driver.findElement(By.id("month")));
	   
	    WebElement option=sele.getFirstSelectedOption();
	    String defaultselecteditem=option.getText();
	    System.out.println("Before Selecting the Month name is "+defaultselecteditem );
	    
	    
	    
	    sele.selectByVisibleText("Jul");
	    WebElement option1=sele.getFirstSelectedOption();
	    String defaultselecteditem1=option1.getText();
	    System.out.println("After Selecting the Month name is  "+defaultselecteditem1);
	    
	    
	    sele.selectByIndex(3);
	    WebElement option2=sele.getFirstSelectedOption();
	    String defaultselecteditem2=option2.getText();
	    System.out.println("After Selecting the Month name is  "+defaultselecteditem2);
	    
	    
	    sele.selectByValue("4");
	    WebElement option3=sele.getFirstSelectedOption();
	    String defaultselecteditem3=option3.getText();
	    System.out.println("After Selecting the Month name is  "+defaultselecteditem3);
	    driver.close();
	}

}
