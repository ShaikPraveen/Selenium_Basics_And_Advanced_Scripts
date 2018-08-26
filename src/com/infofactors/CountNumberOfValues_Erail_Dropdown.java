package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CountNumberOfValues_Erail_Dropdown
{
	public static void main(String[] args) {
		
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://erail.in/");
		Select sele=new Select(driver.findElement(By.id("cmbQuota")));
		
		List<WebElement> allitems=sele.getOptions();
		//System.out.println(allitems.size());
		   
		  int total_items=allitems.size();
		  Assert.assertEquals(total_items, 12);
		  System.out.println("Total Items are "+total_items);
		  
		   for(WebElement ele : allitems) 
		   {
			  String items_names= ele.getText();
			  System.out.println(items_names);
		   }
		 
		   driver.close();   
	}

}
