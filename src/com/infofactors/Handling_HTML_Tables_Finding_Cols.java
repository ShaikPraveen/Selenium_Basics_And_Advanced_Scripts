package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_HTML_Tables_Finding_Cols {

	public static void main(String[] args)
	{
	
   //The Following script Find number of rows and retrieve all table data
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/tools/forex");
		
		WebElement table;
		List<WebElement> tablerows;
		List<WebElement> tableclos;
		
		table=driver.findElement(By.className("dataTable"));
		tablerows=table.findElements(By.tagName("tr"));
		tableclos=tablerows.get(1).findElements(By.tagName("td"));
		System.out.println("The Number of Columns Are  "+tableclos.size());
		driver.close();
	}
}
