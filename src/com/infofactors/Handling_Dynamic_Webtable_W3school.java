package com.infofactors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Dynamic_Webtable_W3school {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement>rows=driver.findElements(By.xpath("/html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr"));
		System.out.println("Number of Rows Are "+rows.size());
		
		
		String   before_xpath="/html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[";
		String   after_xpath="]/td[1]";
		
		
		for (int i = 2; i<=rows.size(); i++) 
		{
			String actXpath=before_xpath+ i + after_xpath;
			WebElement element=driver.findElement(By.xpath(actXpath));
			System.out.println(element.getText());
			
			if (element.getText().equals("Laughing Bacchus Winecellars"))
			{
				System.out.println("Company Name "+ element.getText()+ "is found "+ "At position "+ (i-1));
				break;
			}	
		}
		
		System.out.println("=======================");
		
		//html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[2]/td[2]
		
		String aftercontactxpath="]/td[2]";
		
		for (int i = 2; i<=rows.size(); i++) 
		{
			String actXpath=before_xpath+ i + aftercontactxpath;
			WebElement element=driver.findElement(By.xpath(actXpath));
			System.out.println(element.getText());
		}
		
		System.out.println("===*==*==*=====***====");
		
        String aftercountryxpath="]/td[3]";
		
		for (int i = 2; i<=rows.size(); i++) 
		{
			String actXpath=before_xpath+ i + aftercountryxpath;
			WebElement element=driver.findElement(By.xpath(actXpath));
			System.out.println(element.getText());
		}
		
		//Count Number of Columns
		
		String colbefore_xpath="/html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[1]/th[";
		String colafter_xpath="]";
		List<WebElement>cols=driver.findElements(By.xpath("/html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[1]/th"));
		System.out.println("Total Number of Cols Are =>"+cols.size());
		
		System.out.println("Column Values are =>");
		for (int i = 1; i <=cols.size(); i++) 
		{
			WebElement element=driver.findElement(By.xpath(colbefore_xpath+ i +colafter_xpath));
			String col_names=element.getText();
			System.out.println(col_names);
		}
		
		driver.close();
	}

}
