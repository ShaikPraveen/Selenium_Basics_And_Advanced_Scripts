package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Bootstrap_Dropdown {

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		driver.get("file:///C:/Users/admin/Desktop/bootstrap.html#");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		List<WebElement> dropdown_menu=driver.findElements(By.xpath("html/body/div[1]/div/ul/li/a"));
		 System.out.println(dropdown_menu.size());
		 
		 
		 for (int i = 0; i <dropdown_menu.size() ; i++) 
		 {
			WebElement element= dropdown_menu.get(i);
			String innerhtml=element.getAttribute("innerHTML");			
			if (innerhtml.contentEquals("Javascript"))
			{
				element.click();
				break;	
			}	
			
			System.out.println("Values from the Drop down is =>"+innerhtml);

		}
		 
		driver.close();
	}

}
