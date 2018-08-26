package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Values_PresentOrNot_Erail_Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://erail.in/");
		Select sele=new Select(driver.findElement(By.id("cmbQuota")));
		
		String actvalue,expvalue;
		expvalue="General Quota";
		boolean valueexist=false;
		
		List<WebElement> all_items=sele.getOptions();
		System.out.println(all_items.size());
		
		  for (int i = 0; i < all_items.size(); i++) 
		  {
			  actvalue=all_items.get(i).getText();
			  
			  if (expvalue.equalsIgnoreCase(actvalue)) 
			  {
				  valueexist=true;
				  break;	
			}	
		}
		  if (valueexist) 
		  {
			  System.out.println("TEST PASS "+expvalue +" IS PRESNT");
			
		}else
		  {
			System.out.println("TEST FAIL  "+expvalue + "  IS NOT PRESNT");
		  }
		
		driver.close();
	}

}
