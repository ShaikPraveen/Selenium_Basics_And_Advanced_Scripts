package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Calender_Spicejet 
{
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com/");
		//driver.findElement(By.id("DepartDate")).click();
		WebElement date=driver.findElement(By.id("DepartDate"));
		String dateval="Fri, 31 Aug, 2018";
		
		selectDateByJS(driver,date, dateval);	
	 }
	
	  public static void selectDateByJS(WebDriver driver,WebElement element, String dateval) 
	  {
		  JavascriptExecutor js=((JavascriptExecutor)driver);
		  js.executeScript("arguments[0].setAttribute(value='DepartDate','"+dateval+"');",element);
	  }

}
