package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Tables_Rows_Cols {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 driver.get("http://webdatacommons.org/webtables/");
	     WebElement rowsvalue=driver.findElement(By.xpath(".//*[@id='toccontent']/table[1]/tbody/tr[4]/td[2]"));
		 System.out.println("Row Values is " +rowsvalue.getText());
		 
		 List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='toccontent']/table[1]/tbody/tr"));
		 System.out.println("Number of Rows Are "+rows.size());
		 
		 List<WebElement> cols=driver.findElements(By.xpath(".//*[@id='toccontent']/table[1]/tbody/tr[1]/th"));
		 System.out.println("Number of Columns Are "+ cols.size());
		 driver.close();	
	}
}
