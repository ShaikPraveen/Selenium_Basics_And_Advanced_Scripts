package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingLinks_SoftmindLink 
{
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String actlink, explink;
		  explink="Digital Marketing123";
		  boolean linkexist=false;
		
		driver.get("http://www.softmindinformatics.com/");
		
		driver.findElement(By.linkText("Careers")).click();
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		
		for (int i = 0; i < alllinks.size(); i++) 
		{
			actlink=alllinks.get(i).getText();
			
			if (explink.equalsIgnoreCase(actlink)) 
			{
				linkexist=true;
				break;
			}	
		}
		if (linkexist) 
		{
			System.out.println("TEST PASS");
			
		}else
		{
			System.out.println("TEST FAIL");
		}
		
		driver.close();
	}

}
