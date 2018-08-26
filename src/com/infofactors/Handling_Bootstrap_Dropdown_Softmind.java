package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Bootstrap_Dropdown_Softmind 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.softmindinformatics.com/");
		driver.findElement(By.linkText("Services")).click();
		
		 List<WebElement> dropdown_menu=driver.findElements(By.xpath("html/body/div[2]/nav/div/div[2]/ul/li[3]/ul/li/a"));
		 System.out.println(dropdown_menu.size());
		 
		 
		 
		 for (int i = 0; i <dropdown_menu.size() ; i++) 
		 {
			WebElement element= dropdown_menu.get(i);
			String innerhtml=element.getAttribute("innerHTML");			
			if (innerhtml.contentEquals("E-Commerce"))
			{
				element.click();
				break;	
			}	
			
			System.out.println("Values from the Drop down is =>"+innerhtml);

		}
		 
		driver.close();
	}

}
