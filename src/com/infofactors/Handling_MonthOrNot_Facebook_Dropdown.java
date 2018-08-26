package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_MonthOrNot_Facebook_Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		driver.get("https://www.facebook.com/");
		Select sele=new Select(driver.findElement(By.id("month")));
		
		String actmonth, expmonth;
		expmonth="Month";
		boolean monthexist=false;
		
		List<WebElement> all_months=sele.getOptions();
		System.out.println(all_months.size());
		
		driver.close();
		
		for (int i = 0; i <all_months.size() ; i++) 
		{
			 actmonth=all_months.get(i).getText();
			 
			 if (expmonth.equalsIgnoreCase(actmonth)) 
			 {
				 monthexist=true;
				 break;	
			}	 
		}
		
		if (monthexist) 
		{
			System.out.println("TEST PASS " +expmonth+" IS PRESENT ");
			
		}else 
		{
			System.out.println("TEST FAIL " +expmonth+" IS NOT PRESENT ");
		}
		
		 driver.close();
	}

}
