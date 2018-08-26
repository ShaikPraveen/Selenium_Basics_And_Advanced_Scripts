package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Particular_Row_Value_InTable
{
	public static void main(String[] args) {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		  driver.get("http://webdatacommons.org/webtables/");
	      WebElement element=driver.findElement(By.xpath(".//*[@id='toccontent']/table[1]/tbody/tr[3]/td[2]"));//Finding the Row value this xpath
	      
	      System.out.println("Row value is "+element.getText());
	      
	      List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='toccontent']/table[1]/tbody/tr"));// Finding No.of rows 
	      System.out.println("Number of Rows are  "+rows.size());
	      
	      List<WebElement> cols=driver.findElements(By.xpath(".//*[@id='toccontent']/table[1]/tbody/tr[1]/th"));// Finding No.of Clos 
	      System.out.println("Number of Cols are  "+cols.size());
	      
	      for(WebElement ele: cols) // Reading Cols Names 
	      {
	    	 String colsnames= ele.getText();
	    	 System.out.println(colsnames);
	      }
          driver.close();
	}
}
