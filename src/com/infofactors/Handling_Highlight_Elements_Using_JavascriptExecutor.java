package com.infofactors;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Highlight_Elements_Using_JavascriptExecutor 
{
    public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("gopikamma");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gopikamma12345");
		Thread.sleep(2000);
		
	   WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
	            flash(driver, loginBtn);//highlight the element
	            drawBorder(driver, loginBtn);//Login button shows error, it will shows us border
	            //Take screenshot
	            File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    		FileUtils.copyFile(srcfile, new File("D:\\Screenshot\\loginBtnerror.png"));
	            
	    		//Generate Alert
	    		//generateAlert(driver, "Thers is a problem occured in Login Button");
	    		
	    		//Click on any element by using Js
	    		clickelementByJS(driver,loginBtn);
	    		
	    		//Refresh the Browser by Js
	    		//refreshBrowserByJS(driver);
	    		
	    		//Get the title of the page by Js
	    		System.out.println(getTitleByJS(driver));     
	    		
	    		//Get the Page text by Js
	    		//System.out.println(innerTextByJS(driver));
	    		
	    		
	    		Thread.sleep(2000);
	    		//Scroll page down by js
	    	    //scrollpagedownByJS(driver);
	    	    
	    	    //Forget Password link visible
	    	    WebElement  element=driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]"));
	    	    scrollintoViewByJS(driver, element); 		
	   }

	 public static void flash(WebDriver driver,WebElement element) 
	 {
		 JavascriptExecutor js=((JavascriptExecutor)driver);
		 String bgcolor= element.getCssValue("backgroundColor"); 
		 for (int i =0; i <2; i++) //Blink the element 2 times
		 {
			 
			 changeColor("rgb(0,200,0)", driver, element);
			 changeColor(bgcolor, driver, element);	
		}
	 }
	
	public static void  changeColor(String color, WebDriver driver, WebElement element) 
	  {
		  JavascriptExecutor js=((JavascriptExecutor)driver);
		  js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		  
		  try 
		  {
			  Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			
		}   
	  }
	
	   public static void drawBorder(WebDriver driver, WebElement element) 
	   {
		   JavascriptExecutor js=((JavascriptExecutor)driver);
		   js.executeScript("arguments[0].style.border='3px solid red'", element);
	   }
	
	   public static void generateAlert(WebDriver driver, String message) 
	   {
		   JavascriptExecutor js=((JavascriptExecutor)driver);
		   js.executeScript("alert('"+message+"')");
	   }
	   
	   public static void clickelementByJS(WebDriver driver,WebElement element) 
	   {
		   JavascriptExecutor js=((JavascriptExecutor)driver);
	       js.executeScript("arguments[0].click();", element);
	   }
	   
	   public static void refreshBrowserByJS(WebDriver driver) 
	   {
		   JavascriptExecutor js=((JavascriptExecutor)driver);
	       js.executeScript("history.go(0)");
	   }
	  
	   public static String getTitleByJS(WebDriver driver) 
	   {
		   JavascriptExecutor js=((JavascriptExecutor)driver);
	       String title=js.executeScript("return document.title;").toString();
	       return title;
	   }
	   
	   public static String innerTextByJS(WebDriver driver) 
	   {
		   JavascriptExecutor js=((JavascriptExecutor)driver);
	       String pagetext=js.executeScript("return document.documentElement.innerText;").toString();
	       return pagetext;
	   }
	   
	   public static void scrollpagedownByJS(WebDriver driver) 
	   {
		   JavascriptExecutor js=((JavascriptExecutor)driver);
	       js.executeScript("window.scollTo(0,document.dody.scrollHeight)");   
	   }
	   
	   public static void scrollintoViewByJS(WebDriver driver,WebElement element) 
	   {
		   JavascriptExecutor js=((JavascriptExecutor)driver);
	       js.executeScript("arguments[0].scrollIntoView(true);",element);   
	   }
	   
	  public static void teardown() 
	  {
		  driver.close();
	  }  
}
