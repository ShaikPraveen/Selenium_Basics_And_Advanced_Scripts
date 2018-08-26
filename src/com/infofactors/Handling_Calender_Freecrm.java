package com.infofactors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Calender_Freecrm {

	public static void main(String[] args) throws InterruptedException 
	{	
		//https://www.youtube.com/watch?v=Rjs9qLRP9tM
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("gopikamma");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gopikamma");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		String date="36-September-2018";
		String dateArr[]=date.split("-");//{25,September,2018}
		String day=dateArr[0];
		String month=dateArr[1];
		String year=dateArr[2];
		
		Select sele=new Select(driver.findElement(By.name("slctMonth")));
		sele.selectByVisibleText(month);
		
		Select sele1=new Select(driver.findElement(By.name("slctYear")));
		sele.selectByVisibleText(year);
		
		
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
	    //*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		
		
		String before_xpath="//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String after_xpath="]/td[1]";
		
	   final int totalWeekdays=7;
	   boolean flag=false;
	   String days;
	 //Note :Why i am using flag variable for closing outer loop. if the inner loop is true.
	   
	   for (int rowNum=2; rowNum<=6; rowNum++) //Outer loop
	   {
		   for(int colNum=1; colNum<=totalWeekdays; colNum++) //Inner Loop
		   {
			   try {
			  days=driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).getText();
			   }catch(NoSuchElementException e) 
			   {
				   System.out.println("Please Enter Correct Value");
				   flag=false;
				   break;
			   }
			  System.out.println("Date Values Are "+days);
			  
			  if (days.equals(day)) 
			  {
				  driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).click();
				  flag=true;
				  break;
			}
		   } 
		   if (flag)
		   {
			break;
		} 
	}
	
	}

}
