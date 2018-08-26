package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CountNumberOfMonth_Facebook_Dropdown
{
	public static void main(String[] args) {
		
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		Select sele=new Select(driver.findElement(By.id("month")));
		
		List<WebElement> months_list=sele.getOptions();
		//System.out.println(months_list.size());
		
	      int total_month=months_list.size();
		  
	      Assert.assertEquals(total_month, 13);
	      
	      System.out.println("Total Number of Months are "+ total_month);
	      
	     /* for (int i = 0; i <months_list.size(); i++) 
	      {
	    	  System.out.println(months_list.get(i).getText());
		}*/
	      
	       for(WebElement ele : months_list) 
	       {
	    	   String month_names=ele.getText();
	    	   System.out.println(month_names);
	       }
		driver.close();
	
	}

}
