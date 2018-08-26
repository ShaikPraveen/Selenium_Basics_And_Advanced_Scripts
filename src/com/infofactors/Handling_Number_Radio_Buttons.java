package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Number_Radio_Buttons {

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> allradios=driver.findElements(By.xpath("//input[@name='sex' and @type='radio']"));
		System.out.println("Number of Radio Buttons in Facebook Application is => "+allradios.size());
		
         for (int i = 0; i < allradios.size(); i++)
        {
        	 WebElement local_radio=allradios.get(i);
        	 String value=local_radio.getAttribute("value");
        	 
        	System.out.println("Vaues From Radio Buttons Are "+value);
		}
	    driver.close();
      }
}
